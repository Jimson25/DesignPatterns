package samplefactory.Client;

import samplefactory.factory.AbstractHumanFactory;
import samplefactory.factory.HumanFactory;
import samplefactory.product.BlackHuman;
import samplefactory.product.WhiteHuman;
import samplefactory.product.YellowHuman;

/**
 * 女娲造人
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();

        YellowHuman yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.sayHi();
        yellowHuman.sleep();

        BlackHuman blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.sayHi();
        blackHuman.sleep();

        WhiteHuman whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.sayHi();
        whiteHuman.sleep();

    }
}
