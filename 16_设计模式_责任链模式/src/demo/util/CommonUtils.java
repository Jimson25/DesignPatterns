package demo.util;

import demo.chain.ChainController;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class CommonUtils {
    public static final ThreadLocal local = new ThreadLocal();

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

    public static void register(Class cls, boolean isParent) {
        String userHome = System.getProperty("user.home");
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        StringBuffer path = new StringBuffer(userHome).append("/chain/").append(date).append("/");
        File file = new File(path.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        String clsName = cls.getName();
        local.set(path.toString());
        file = new File(path.append(clsName).toString());
        if (isParent) {
            writeToFile(file, clsName);
        }
    }

}
