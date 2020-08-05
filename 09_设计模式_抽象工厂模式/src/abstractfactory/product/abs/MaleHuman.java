package abstractfactory.product.abs;

public abstract class MaleHuman implements Human{
    protected String sex ;

    public void setSex(String sex) {
        this.sex = sex;
    }
}
