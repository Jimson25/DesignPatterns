package singleton.b_饿汉式;

/**
 * 饿汉式实现单例模式
 * 优点: 简单,在类装载的时候完成了实例化,避免了线程同步问题
 * 缺点: 在类加载的时候就完成了实例化,没有达到懒加载的效果,如果该类没有使用的话可能造成内存浪费
 */
public class Singleton {
    //私有化构造方法
    private Singleton() {}

    //先创建一个私有静态常亮实例
    private static final Singleton SINGLETON = new Singleton();

    //公开一个public方法返回当前对象
    public static Singleton getInstance(){
        return SINGLETON;
    }

    public void showMsg(){
        System.out.println("饿汉式");
    }
}
