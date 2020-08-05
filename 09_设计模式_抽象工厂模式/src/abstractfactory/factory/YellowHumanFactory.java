package abstractfactory.factory;

import abstractfactory.product.abs.FemaleHuman;
import abstractfactory.product.abs.MaleHuman;
import abstractfactory.product.entity.YellowFemaleHuman;
import abstractfactory.product.entity.YellowMaleHuman;

/**
 * 黄种人的抽象工厂
 */
public class YellowHumanFactory implements AbstractFactory {
    @Override
    public FemaleHuman createFemaleHuman() {
        YellowFemaleHuman human = new YellowFemaleHuman();
        human.setColor("yellow");
        human.setSex("women");
        return human;
    }

    @Override
    public MaleHuman createMaleHuman() {
        YellowMaleHuman human = new YellowMaleHuman();
        human.setColor("white");
        human.setSex("man");
        return human;
    }
}
