package demo_01;

/**
 * 员工抽象类
 */
public abstract class Employee {
    public final static int MALE = 0; //0代表是男性
    public final static int FEMALE = 1; //1代表是女性

    private String name;
    private int salary;
    private int sex;

    //打印出员工的信息
    public final void report(){
        String info = "姓名：" + this.name + "\t";
        info = info + "性别：" + (this.sex == FEMALE?"女":"男") + "\t";
        info = info + "薪水：" + this.salary + "\t";
        //获得员工的其他信息
        info = info + this.getOtherInfo();
        System.out.println(info);
    }

    //拼装员工的其他信息
    protected abstract String getOtherInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
