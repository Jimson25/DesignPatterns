package samplefactory.factory;

import samplefactory.product.Human;

/**
 * 创建一个抽象工厂类,作为一个简单工厂模式这里其实是不用抽象层的,先写上
 */
public abstract class AbstractHumanFactory {
    /**
     *  创建人类的抽象方法,这里使用泛型定义参数上界
     * @param t
     * @param <T>
     * @return
     */
    public abstract <T extends Human>T  createHuman(Class<T> t);
}
