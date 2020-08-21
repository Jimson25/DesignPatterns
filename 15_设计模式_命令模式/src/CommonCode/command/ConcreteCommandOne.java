package CommonCode.command;

import CommonCode.receiver.Receiver;

/**
 * 具体的命令类
 */
public class ConcreteCommandOne extends Command {
    //这个命令该由谁去执行
    private Receiver receiver;

    //获取命令的执行者
    public ConcreteCommandOne(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
