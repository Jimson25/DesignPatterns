package samplefactory.factory;

import samplefactory.product.Human;

public class HumanFactory extends AbstractHumanFactory{

    /**
     * 创建工厂类使用反射创建对象,反射强大的一批
     * @param t
     * @param <T>
     * @return
     */
    @Override
    public <T extends Human> T createHuman(Class<T> t) {
        Human human = null;
        try {
            human = (T) Class.forName(t.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) human;
    }
}
