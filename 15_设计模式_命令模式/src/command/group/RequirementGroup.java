package command.group;

/**
 * 具体角色 - 需求组
 */
public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到 " + "需求组 ~~");
    }

    @Override
    public void add() {
        System.out.println("需求组" + "添加功能 ~~");
    }

    @Override
    public void delete() {
        System.out.println("需求组" + "删除功能 ~~");
    }

    @Override
    public void change() {
        System.out.println("需求组" + "修改功能 ~~");
    }

    @Override
    public void plan() {
        System.out.println("需求组" + "变更计划 ~~");
    }
}
