package sample;

public class Client {
    public static void main(String[] args) {
        IWomen women = new Women(2, "逛街");

        AbstractHandler father = new Father();
        AbstractHandler husband = new Husband();
        AbstractHandler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);

        father.HandleMessage(women);


    }
}
