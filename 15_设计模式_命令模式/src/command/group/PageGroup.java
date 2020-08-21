package command.group;

/**
 * 具体角色 - 美工组
 */
public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到 " + "美工组 ~~");
    }

    @Override
    public void add() {
        System.out.println("美工组" + "添加功能 ~~");
    }

    @Override
    public void delete() {
        System.out.println("美工组" + "删除功能 ~~");
    }

    @Override
    public void change() {
        System.out.println("美工组" + "修改功能 ~~");
    }

    @Override
    public void plan() {
        System.out.println("美工组" + "变更计划 ~~");
    }
}
