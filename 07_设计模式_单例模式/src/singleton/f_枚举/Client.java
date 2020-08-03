package singleton.f_枚举;

public class Client {
    public static void main(String[] args) {
        Singleton.INSTANCE.showMsg();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(Singleton.INSTANCE.hashCode());
            }).start();
        }

    }
}
