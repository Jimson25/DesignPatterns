package singleton.b_懒汉式同步方法;

public class Client {
    public static void main(String[] args) {
        //此时无论执行多少次都是同一个对象
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton.getInstance().hashCode())).start();
        }

//        System.out.println(Singleton.getInstance() == Singleton.getInstance());
//
//        Singleton.getInstance().showMsg();
    }
}
