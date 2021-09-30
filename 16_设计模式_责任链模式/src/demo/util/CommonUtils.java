package demo.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {

    public static final ThreadLocal LOCAL = new ThreadLocal();

    public static void writeToFile(File file, String msg) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(msg.getBytes(StandardCharsets.UTF_8));
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 将传入的字节码对象对应的类注册到其父类下
     *
     * @param cls
     */
    public static void register(Class cls) {
        String userHome = System.getProperty("user.home");
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        StringBuffer path = new StringBuffer(userHome).append("/chain/").append(date).append("/");

        LOCAL.set(path.toString());

        File file = new File(path.toString());
        if (!file.exists()) {
            file.mkdirs();
        }

        String clsName = cls.getName();
        String parentName = cls.getSuperclass().getName();
        file = new File(path.append(parentName).toString());
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(clsName.getBytes(StandardCharsets.UTF_8));
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
