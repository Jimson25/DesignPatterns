package singleton.a_懒汉式;

public class Client {
    public static void main(String[] args) {

        //此时会出现多个不同的内存地址
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton.getInstance())).start();
        }
        System.out.println(Singleton.getInstance() == Singleton.getInstance());

        Singleton.getInstance().showMsg();
    }
}
