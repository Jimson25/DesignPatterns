package proxy.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("proxy.proxy.RealSubject");
    }
}
