package demo.chain;

import demo.util.CommonUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;

public abstract class ChainController {

    protected abstract void init();

    protected abstract void end();

    protected abstract void process();

    protected abstract void before();

    protected abstract void destroy();

    public static void start() throws Exception {

        String path = ChainController.class.getResource("").toString() + "task/";
        String parentPath = ChainController.class.getName();
        parentPath = parentPath.substring(0,parentPath.lastIndexOf("."));
        File[] files = new File(path).listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                continue;
            }
            Constructor<?> constructor = Class.forName(parentPath + f.getName()).getDeclaredConstructor();
            constructor.setAccessible(true);
            ChainController controller = (ChainController) constructor.newInstance();
            controller.init();
            controller.before();
            controller.process();
            controller.end();
            controller.destroy();
        }

//        String path = (String) CommonUtils.LOCAL.get();
//        BufferedReader reader = new BufferedReader(new FileReader(path + ChainController.class.getName()));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            ChainController controller = (ChainController) Class.forName(line).getDeclaredConstructor().newInstance();
//            controller.init();
//            controller.before();
//            controller.process();
//            controller.end();
//            controller.destroy();
//        }
    }

}
