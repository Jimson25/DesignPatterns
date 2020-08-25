package sample;

public abstract class  IWomen {

    protected int type;
    protected String request;

    public IWomen(int type, String request) {
        this.type = type;
        this.request = request;
    }

    public abstract int getType();

    public abstract String getRequest();


}
