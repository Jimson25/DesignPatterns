package demo_02;

public abstract class Employee {
    public final static int MALE = 0; //0代表是男性
    public final static int FEMALE = 1; //1代表是女性

    private int salary;
    private String name;
    private int sex;

    //允许一个访问者访问
    public abstract void accept(IVisitor visitor);

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
