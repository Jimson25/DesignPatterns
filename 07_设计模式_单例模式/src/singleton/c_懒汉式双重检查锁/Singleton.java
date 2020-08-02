package singleton.c_懒汉式双重检查锁;

/**
 * 懒汉式实现单例(双重检查锁)
 * 优点: 线程安全,执行效率高
 * 缺点: -
 * <p>
 * {同步代码块的方式没有写的意义,不做展示.就在判断完创建实例的时候加个同步锁就是了,效率提高了但是还是线程不安全}
 */
public class Singleton {
    //私有化构造
    private Singleton() {
    }

    //先创建一个对象引用,这里的volatile可以防止创建实例时发生指令优化,从而产生一个空的对象
    private static volatile Singleton instance;

    //在每次获取该对象之前先做一个判断对象是否为空,如果为空就创建对象,否则就直接返回对象实例
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMsg() {
        System.out.println("懒汉式");
    }
}
