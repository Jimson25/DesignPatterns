package methodfactory.factory;

import methodfactory.product.BlackHuman;
import methodfactory.product.Human;

/**
 * 创建黑种人的工厂类
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    /**
     * 创建工厂类使用反射创建对象
     */
    @Override
    public Human createHuman() {
        Human blackHuman = new BlackHuman();
        blackHuman.setColor("black");
        return blackHuman;
    }



}
