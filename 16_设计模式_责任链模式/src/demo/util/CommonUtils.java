package demo.util;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonUtils {
    private static final Map<String, List<String>> taskMap = new HashMap<>();

    /**
     * 任务注册
     *
     * @param parent 任务父类
     * @param task   任务实现类
     */
    public static void register(String parent, String task) {
        List<String> registeredSet = taskMap.computeIfAbsent(parent, k -> new ArrayList<String>());
        StringBuilder sb = new StringBuilder(System.getProperty("user.home"));
        sb.append("/").append("chain").append("/");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        sb.append(parent).append(".register");
        file = new File(sb.toString());
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            while ((line = reader.readLine()) != null) {
                if (!registeredSet.contains(line))
                    registeredSet.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (registeredSet.contains(task)) {
            return;
        }
        writeToFile(file, task);
        registeredSet.add(task);
    }

    /**
     * 根据给定的字节码对象获取类名，再获取注册到该类名下的任务集合
     *
     * @param cls 任务父类字节码对象
     * @return 任务实现类集合
     */
    public static List<String> getTaskSet(Class cls) {
        String name = cls.getSimpleName();
        List<String> set = taskMap.get(name);
        if (null == set) {
            set = new ArrayList<>();
        }
        return set;
    }

    /**
     * 写入子任务到文件
     *
     * @param file 任务列表文件
     * @param task 任务名
     */
    private static void writeToFile(File file, String task) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
            writer.write(task);
            writer.write("\r\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
