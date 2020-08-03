package methodfactory.factory;

import methodfactory.product.Human;
import methodfactory.product.YellowHuman;

/**
 * 创建黄种人的工厂类
 */
public class YellowHumanFactory extends AbstractHumanFactory {

    /**
     * 创建工厂类使用反射创建对象,反射强大的一批
     */
    @Override
    public Human createHuman() {
        Human human = new YellowHuman();
        human.setColor("yellow");
        return human;
    }
}
