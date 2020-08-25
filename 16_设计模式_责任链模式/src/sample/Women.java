package sample;

/**
 * 感觉书上这里设计的不合理
 *  1: IWomen使用抽象类更加合适
 *  2: 继承(实现)IWomen的直接使用具体的角色(女儿,妻子等)会更好
 */
public class Women extends IWomen {

    public Women(int type, String request) {
        super(type, request);
    }

    @Override
    public int getType() {
        return super.type;
    }

    @Override
    public String getRequest() {
        return super.request;
    }
}
