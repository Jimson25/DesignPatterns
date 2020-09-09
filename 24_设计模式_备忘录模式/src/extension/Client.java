package extension;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        System.out.println(originator.getState());
        caretaker.setOriginator(originator.createMemento());

        originator.setState("----------------------");
        System.out.println(originator.getState());

        originator.restore(caretaker.getOriginator());
        System.out.println(originator.getState());

    }
}
