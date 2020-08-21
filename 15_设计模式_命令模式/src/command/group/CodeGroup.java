package command.group;

/**
 * 具体角色 - 开发组
 */
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到 " + "代码组 ~~");
    }

    @Override
    public void add() {
        System.out.println("代码组" + "添加功能 ~~");
    }

    @Override
    public void delete() {
        System.out.println("代码组" + "删除功能 ~~");
    }

    @Override
    public void change() {
        System.out.println("代码组" + "修改功能 ~~");
    }

    @Override
    public void plan() {
        System.out.println("代码组" + "变更计划 ~~");
    }
}
