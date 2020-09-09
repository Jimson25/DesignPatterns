package template;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        System.out.println(originator.getState());
        // 对当前状态进行备份
        caretaker.setMemento(originator.createMemento());

        originator.setState("这心情就不好了！！！");
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());

    }
}
