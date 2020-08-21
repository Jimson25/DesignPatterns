package CommonCode.command;

import CommonCode.receiver.Receiver;

/**
 * 具体的命令类
 */
public class ConcreteCommandTwo extends Command {
    //这个命令该由谁去执行
    private Receiver receiver;

    public ConcreteCommandTwo(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
