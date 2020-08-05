package abstractfactory.factory;

import abstractfactory.product.abs.FemaleHuman;
import abstractfactory.product.abs.MaleHuman;
import abstractfactory.product.entity.BlackFemaleHuman;
import abstractfactory.product.entity.BlackMaleHuman;

/**
 * 黑种人的抽象工厂
 */
public class BlackHumanFactory implements AbstractFactory {
    @Override
    public FemaleHuman createFemaleHuman() {
        BlackFemaleHuman human = new BlackFemaleHuman();
        human.setColor("black");
        human.setSex("women");
        return human;
    }

    @Override
    public MaleHuman createMaleHuman() {
        BlackMaleHuman human = new BlackMaleHuman();
        human.setColor("black");
        human.setSex("man");
        return human;
    }
}
