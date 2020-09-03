package 遍历;

import java.util.ArrayList;

public abstract class Corp {
    //公司每个人都有名称
    private String name = "";
    //公司每个人都职位
    private String position = "";
    //公司每个人都有薪水
    private int salary =0;
    //父节点是谁
    private Corp parent = null;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //获得员工信息
    public String getInfo(){
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位："+ this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
    //设置父节点
    protected void setParent(Corp parent){
        this.parent = parent;
    }
    //得到父节点
    public Corp getParent(){
        return this.parent;
    }

    public abstract ArrayList<Corp> getSubNode();


}
