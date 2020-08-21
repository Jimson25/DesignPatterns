package CommonCode.invok;

import CommonCode.command.Command;

/**
 * 命令的分配者,项目经理
 */
public class Invoker {
    //具体命令
    private Command command;

    /**
     * 接收一条命令
     * @param command 接收到的命令
     * @return 返回当前对象用于链式调用
     */
    public Invoker setCommand(Command command) {
        this.command = command;
        return this;
    }

    /**
     * 执行命令
     */
    public void action(){
        this.command.execute();
    }
}
