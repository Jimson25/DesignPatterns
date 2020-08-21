package command;

import command.command.AddRequirementCommand;
import command.command.Command;
import command.command.DeletePageCommand;
import command.invok.Invoker;

/**
 * 执行命令的客户端
 *
 */
public class Client {
    public static void main(String[] args) {
         // 创建一个调度者
        Invoker projectManager = new Invoker();
        //产生一条添加需求的命令
        Command command = new AddRequirementCommand();
        //将命令传递给调度者并执行它
        projectManager.setCommand(command).action();

        // 产生一个删除页面的命令
        command = new DeletePageCommand();
        //将命令传递给调度者并执行它
        projectManager.setCommand(command).action();
    }
}
