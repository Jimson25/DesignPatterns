package methodfactory.factory;

import methodfactory.product.Human;
import methodfactory.product.WhiteHuman;

/**
 * 创建白种人的工厂类
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    /**
     * 创建工厂类使用反射创建对象,反射强大的一批
     */
    @Override
    public Human createHuman() {
        Human human = new WhiteHuman();
        human.setColor("white");
        return human;
    }


}
