package extension_02;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        System.out.println("初始状态： ");
        System.out.println("\t" + originator.getState());

        originator.createMemento();

        originator.setState("这是修改后的状态！！");
        System.out.println("修改后的状态： ");
        System.out.println("\t" + originator.getState());

        originator.restore();
        System.out.println("还原后的状态： ");
        System.out.println("\t" + originator.getState());

    }
}
