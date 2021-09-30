package demo;

import demo.chain.ChainController;

/**
 * 责任链模式demo
 * 设计：
 *  设计一个启动类作为对外接口，系统中的每一项任务对应一个实现类继承启动类
 *  在调用启动类的start()之后依次执行实现类的对应任务
 * 技术点：
 *  1. 子类继承父类之后在子类中添加静态代码块，将自身的全路径名写入到一个临时文件中的父类全路径下
 *
 */
public class Main {
    public static void main(String[] args) {
        new ChainController().start();
    }
}
