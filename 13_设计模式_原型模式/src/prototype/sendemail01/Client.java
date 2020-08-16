package prototype.sendemail01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 成功发送 6000000 封邮件,共耗时: 30411ms
 */
public class Client {
    private static final int MAX_COUNT = 60;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("辣鸡邮件");

        System.out.println("start time: " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        long start = System.currentTimeMillis();

        while (i < MAX_COUNT) {
            mail.setAppellation(randomStr(5) + "先生(女士)");
            mail.setReceiver(randomStr(5) + "@" + randomStr(8) + ".com");
            System.out.println("标题: " + mail.getSubject() + "\t收件人: " + mail.getReceiver() + "\t-----发送成功!!");
            i++;
        }
        System.out.println("end time: " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        System.out.println("成功发送 " + MAX_COUNT + " 封邮件,共耗时: " + (System.currentTimeMillis() - start) + "ms");
    }

    private static String randomStr(int length) {
        int i = 0;
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        while (i < length) {
            int num = random.nextInt(26);
            Character chr = (char) (random.nextBoolean() ? (num + 65) : (num + 97));
            sb.append(chr.toString());
            i++;
        }
        return sb.toString();
    }
}
