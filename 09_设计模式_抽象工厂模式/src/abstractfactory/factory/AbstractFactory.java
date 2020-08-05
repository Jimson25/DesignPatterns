package abstractfactory.factory;

import abstractfactory.product.abs.FemaleHuman;
import abstractfactory.product.abs.MaleHuman;

/**
 * 顶级抽象工厂接口
 */
public interface AbstractFactory {
    /**
     * 创造女人
     * @return 各种肤色的女性
     */
    FemaleHuman createFemaleHuman();

    /**
     * 创造男人
     * @return 各种肤色的男性
     */
    MaleHuman createMaleHuman();
}
