package sample;

public class Father extends AbstractHandler {
    public Father() {
        super(AbstractHandler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println(women.getRequest());
        System.out.println("sample.Father : exec....");
    }

}
