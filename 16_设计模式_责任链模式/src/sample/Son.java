package sample;

public class Son extends AbstractHandler {
    public Son() {
        super(AbstractHandler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println(women.getRequest());
        System.out.println("sample.Son : exec....");
    }

}
