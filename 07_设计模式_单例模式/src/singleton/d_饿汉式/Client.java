package singleton.d_饿汉式;

public class Client {
    public static void main(String[] args) {

        System.out.println(Singleton.getInstance()==Singleton.getInstance());

        Singleton.getInstance().showMsg();
    }
}
