package command.command;

/**
 * 提出一个添加需求的命令
 */
public class AddRequirementCommand extends Command {

    /**
     * 添加需求这个命令的执行过程
     */
    @Override
   public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
    }
}
