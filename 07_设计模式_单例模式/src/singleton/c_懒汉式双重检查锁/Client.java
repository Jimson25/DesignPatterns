package singleton.c_懒汉式双重检查锁;

public class Client {
    public static void main(String[] args) {
        //此时无论执行多少次都是同一个对象,这里线程执行时是阻塞的,可以使用CountDownLatch来统计执行时间
        // TODO: 2020/8/2 加上CountDownLatch来统计执行时间
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton.getInstance().hashCode())).start();
        }

//        System.out.println(Singleton.getInstance() == Singleton.getInstance());
//
//        Singleton.getInstance().showMsg();
    }
}
