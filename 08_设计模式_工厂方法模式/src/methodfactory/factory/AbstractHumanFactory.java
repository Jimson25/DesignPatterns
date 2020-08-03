package methodfactory.factory;

import methodfactory.product.Human;

/**
 * 创建一个抽象工厂类
 */
public abstract class AbstractHumanFactory {
    /**
     *  创建人类的抽象方法
     */
    public abstract Human createHuman();
}
