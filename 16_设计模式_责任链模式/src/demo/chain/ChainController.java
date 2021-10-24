package demo.chain;

import demo.util.CommonUtils;

import java.util.List;
import java.util.Set;

public abstract class ChainController {


    protected abstract void init();

    protected abstract void end();

    protected abstract void process();

    protected abstract void before();

    protected abstract void destroy();

    public static void start() {
        List<String> taskSet = CommonUtils.getTaskSet(ChainController.class);
        for (String s : taskSet) {
            try {
                String className = "demo.chain.task." + s;
                ChainController controller = (ChainController) Class.forName(className).getDeclaredConstructor().newInstance();
                controller.init();
                controller.before();
                controller.process();
                controller.end();
                controller.destroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
