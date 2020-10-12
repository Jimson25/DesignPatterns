package template;

import java.util.HashMap;

/**
 * 享元工厂
 * 构造一个池容器并提供从池中获取对象的方法。
 */
public class FlyweightFactory {
    //定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;

        if (!pool.containsKey(extrinsic)) {
            flyweight = new ConcreteFlyweight(extrinsic);
            pool.put(extrinsic, flyweight);
        } else {
            flyweight = pool.get(extrinsic);
        }
        return flyweight;
    }
}
