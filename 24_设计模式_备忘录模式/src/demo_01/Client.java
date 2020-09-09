package demo_01;

public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setState("这是一个大晴天！！！！");
        System.out.println(boy.getState());

        System.out.println("\n\n=================\n\n");

        Memento memento = boy.createMemento();
        boy.setState("这不是一个大晴天！！！");
        System.out.println(boy.getState());

        System.out.println("\n\n=================\n\n");

        boy.restoreMemento(memento);
        System.out.println(boy.getState());
        
    }

}
