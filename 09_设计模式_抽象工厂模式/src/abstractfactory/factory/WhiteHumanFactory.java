package abstractfactory.factory;

import abstractfactory.product.abs.FemaleHuman;
import abstractfactory.product.abs.MaleHuman;
import abstractfactory.product.entity.WhiteFemaleHuman;
import abstractfactory.product.entity.WhiteMaleHuman;

/**
 * 白种人的抽象工厂
 */
public class WhiteHumanFactory implements AbstractFactory {
    @Override
    public FemaleHuman createFemaleHuman() {
        WhiteFemaleHuman human = new WhiteFemaleHuman();
        human.setColor("white");
        human.setSex("women");
        return human;
    }

    @Override
    public MaleHuman createMaleHuman() {
        WhiteMaleHuman human = new WhiteMaleHuman();
        human.setColor("white");
        human.setSex("man");
        return human;
    }
}
