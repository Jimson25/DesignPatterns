package command.command;

/**
 * 添加一个删除页面的需求
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
    }
}
