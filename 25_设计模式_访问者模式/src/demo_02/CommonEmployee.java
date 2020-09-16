package demo_02;

public class CommonEmployee extends Employee {
    private String job;


    @Override
    public void accept(IVisitor visitor) {

    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
