package singleton.e_静态内部类;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Singleton.getInstance());
            }).start();
        }
    }
}
