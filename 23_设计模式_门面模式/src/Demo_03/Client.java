package Demo_03;

public class Client {
    public static void main(String[] args) {
        ModernPostOffice postOffice = new ModernPostOffice();
        postOffice.sendLetter("这是信的内容","这是收件地址");
    }
}
