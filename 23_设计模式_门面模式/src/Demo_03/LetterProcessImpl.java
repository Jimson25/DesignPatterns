package Demo_03;

public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("写信的内容是： " + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("收件人地址是：" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封。。。。。");
    }

    @Override
    public void sendLetter() {
        System.out.println("前往邮局~~~~");
    }
}
