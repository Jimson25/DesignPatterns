package command.command;

import command.group.CodeGroup;
import command.group.PageGroup;
import command.group.RequirementGroup;

/**
 * 发布的命令的抽象类
 */
public abstract class Command {
    //执行命令的角色
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    /**
     * 确定一个具体的命令该怎么执行的抽象方法
     */
    public abstract void execute();
}
