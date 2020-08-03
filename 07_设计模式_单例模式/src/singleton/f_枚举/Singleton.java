package singleton.f_枚举;

/**
 * 枚举类实现单例
 * 优点: 1)简单方便
 *      2)线程安全
 *      3)不会被反序列化等方式破坏
 */
public enum Singleton {
    INSTANCE;
    public void showMsg(){
        System.out.println("enum instance");
    }
}
