package sample;

public class Husband extends AbstractHandler {
    public Husband() {
        super(AbstractHandler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println(women.getRequest());
        System.out.println("sample.Husband : exec....");
    }

}
