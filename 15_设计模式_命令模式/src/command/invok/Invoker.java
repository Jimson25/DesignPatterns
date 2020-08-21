package command.invok;

import command.command.Command;

/**
 * 命令的发布者,项目经理
 */
public class Invoker {
    private Command command;

    public Invoker setCommand(Command command) {
        this.command = command;
        return this;
    }

    /**
     * 项目经理执行这个命令
     */
    public void action() {
        this.command.execute();
    }
}
