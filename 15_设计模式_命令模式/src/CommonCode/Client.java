package CommonCode;

import CommonCode.command.ConcreteCommandOne;
import CommonCode.invok.Invoker;
import CommonCode.receiver.ConcreteReceiverOne;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        ConcreteReceiverOne receiverOne = new ConcreteReceiverOne();
        ConcreteCommandOne concreteCommandOne = new ConcreteCommandOne(receiverOne);
        invoker.setCommand(concreteCommandOne).action();
    }
}
