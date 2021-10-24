package demo;

import demo.chain.ChainController;
import demo.util.CommonUtils;

import java.io.FileNotFoundException;

/**
 * 责任链模式demo
 * 设计：
 *  设计一个启动类作为对外接口，系统中的每一项任务对应一个实现类继承启动类
 *  在调用启动类的start()之后依次执行实现类的对应任务
 * 技术点：
 *
 */
public class Main {
    public static void main(String[] args) {
        try {
            CommonUtils.register("ChainController","Task01");
            CommonUtils.register("ChainController","Task02");
//            CommonUtils.register("ChainController","Task01");
            ChainController.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
