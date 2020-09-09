package demo_02;

public class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();

        boy.setState("这是一个大晴天！！！！");
        System.out.println(boy.getState());
        //记录当前状态
        caretaker.setMemento(boy.createMemento());

        System.out.println("\n\n=================\n\n");

        boy.setState("这不是一个大晴天！！！");
        System.out.println(boy.getState());

        System.out.println("\n\n=================\n\n");

        //返回到记录的状态
        boy.restoreMemento(caretaker.getMemento());
        System.out.println(boy.getState());
        
    }

}
