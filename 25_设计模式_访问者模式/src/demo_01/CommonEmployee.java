package demo_01;

/**
 * 普通员工类
 */
public class CommonEmployee extends Employee {
    private String job;

    @Override
    protected String getOtherInfo() {
        return "工作：" + this.job + "\t";
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
