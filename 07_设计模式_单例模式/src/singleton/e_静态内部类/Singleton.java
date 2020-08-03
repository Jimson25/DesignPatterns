package singleton.e_静态内部类;

/**
 * 静态内部类实现单例 (推荐实际开发中使用)
 * 优点: 1)采用类加载机制保证实例初始化时只有一个实例
 *      2)在调用getInstance()时才会实例化SingletonInstance类,保证懒加载,避免内存浪费.
 *      3)类的静态属性只会在第一次加载类的时候初始化,所以在内存中有且只有一个实例对象存在,避免了线程安全问题.
 *
 */
public class Singleton {
    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
