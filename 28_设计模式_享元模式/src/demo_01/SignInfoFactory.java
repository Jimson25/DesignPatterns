package demo_01;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 获取对象的工厂类
 *  - 这里如果使用的是HashMap并且没有加锁，那么当处于并发场景的时候会出现多个线程同时获取到池中的同一个对象从而产生并发问题
 */
public class SignInfoFactory {
    //容器池
    private static HashMap<String, SignInfo> pool = new HashMap<>();
//    private static ConcurrentHashMap<String, SignInfo> pool = new ConcurrentHashMap<>();

    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;

        if (!pool.containsKey(key)) {
            //池中不存在该对象
            System.out.println(key + "----建立对象，并放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            //池中存在该对象
            result = pool.get(key);
            System.out.println(key + "---直接从池中取得");
        }
        return result;
    }
}
