package singleton.a_懒汉式;

/**
 * 懒汉式实现单例
 * 优点: 简单方便,线程不安全,只能在单线程环境下使用
 * 缺点: 线程不安全,比如说在第一个线程进去获取实例时判断该对象为空,但是时间片结束了
 * 而此时第二个对象再判断时是没有创建该对象的实例的,他就会创建一个对象实例并返回
 * 然后等原先的线程再获取到时间片时又会再创建一个对象,此时内存中就出现了两个该类的对象,不符合设计要求
 */
public class Singleton {
    //私有化构造
    private Singleton(){}

    //先创建一个对象引用
    private static Singleton instance;

    //在每次获取该对象之前先做一个判断对象是否为空,如果为空就创建对象,否则就直接返回对象实例
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMsg(){
        System.out.println("懒汉式");
    }
}
