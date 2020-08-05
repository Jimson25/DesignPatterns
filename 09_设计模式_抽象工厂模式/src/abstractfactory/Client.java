package abstractfactory;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.BlackHumanFactory;
import abstractfactory.factory.WhiteHumanFactory;
import abstractfactory.factory.YellowHumanFactory;
import abstractfactory.product.abs.Human;

/**
 * 完美!!!
 * 这里我们通过抽象工厂模式实现了不同分钟不同性别的造人,后期扩展上面
 * 如果我们还想要一个灰色人种,那么只需要创建灰色人种的男性和女性实体,分别继承MaleHuman和FemaleHuman抽象层并实现对应方法,
 * 再创建一个灰色人种的创造工厂并实现AbstractFactory接口,在灰色人种工厂中分别实现创造男性和女性的方法即可
 * 所以,通过这种方法实现的话后期我们需要对程序进行扩展时不用修改已有的代码,只需要继承或实现相应的抽象层即可
 *
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory;
        Human human;

        System.out.println("====== 黑种人男性 =======");
        factory = new BlackHumanFactory();
        human = factory.createMaleHuman();
        human.getColor();
        human.getSex();
        human.say();

        System.out.println("====== 黑种人女性 =======");
        factory = new BlackHumanFactory();
        human = factory.createFemaleHuman();
        human.getColor();
        human.getSex();
        human.say();

        System.out.println("====== 白种人男性 =======");
        factory = new WhiteHumanFactory();
        human = factory.createMaleHuman();
        human.getColor();
        human.getSex();
        human.say();

        System.out.println("====== 白种人女性 =======");
        factory = new WhiteHumanFactory();
        human = factory.createFemaleHuman();
        human.getColor();
        human.getSex();
        human.say();

        System.out.println("====== 黄种人男性 =======");
        factory = new YellowHumanFactory();
        human = factory.createMaleHuman();
        human.getColor();
        human.getSex();
        human.say();

        System.out.println("====== 黄种人女性 =======");
        factory = new YellowHumanFactory();
        human = factory.createFemaleHuman();
        human.getColor();
        human.getSex();
        human.say();

    }
}
