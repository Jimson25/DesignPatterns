package singleton.b_懒汉式同步方法;

/**
 * 懒汉式实现单例
 * 优点: 解决了线程安全的问题
 * 缺点: 效率太低了,锁的粒度太大,多线程访问都在阻塞
 */
public class Singleton {
    //私有化构造
    private Singleton(){}

    //先创建一个对象引用
    private static Singleton instance;

    //在每次获取该对象之前先做一个判断对象是否为空,如果为空就创建对象,否则就直接返回对象实例
    public static synchronized Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMsg(){
        System.out.println("懒汉式");
    }
}
