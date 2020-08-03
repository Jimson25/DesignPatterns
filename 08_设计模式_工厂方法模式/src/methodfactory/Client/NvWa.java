package methodfactory.Client;

import methodfactory.factory.AbstractHumanFactory;
import methodfactory.factory.BlackHumanFactory;
import methodfactory.factory.WhiteHumanFactory;
import methodfactory.factory.YellowHumanFactory;
import methodfactory.product.Human;

/**
 * 女娲造人
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory factory;
        Human human;

        //创建黄种人工厂
        factory = new YellowHumanFactory();
        human = factory.createHuman();
        System.out.println(human.getColor());
        human.sayHi();
        human.sleep();
        System.out.println("============================");

        //创建白种人工厂
        factory = new WhiteHumanFactory();
        human = factory.createHuman();
        System.out.println(human.getColor());
        human.sayHi();
        human.sleep();
        System.out.println("============================");


        //创建黑种人工厂
        factory = new BlackHumanFactory();
        human = factory.createHuman();
        System.out.println(human.getColor());
        human.sayHi();
        human.sleep();
    }
}
