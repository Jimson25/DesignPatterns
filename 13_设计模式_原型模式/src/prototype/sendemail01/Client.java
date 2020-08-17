package prototype.sendemail01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 成功发送 6000000 封邮件,共耗时: 30411ms
 */
public class Client {
    private static final int MAX_COUNT = 6000000;

    public static void main(String[] args) {

        AtomicInteger i = new AtomicInteger();
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("辣鸡邮件");
        final CountDownLatch latch = new CountDownLatch(MAX_COUNT);

        //创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);

        System.out.println("start time: " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        long start = System.currentTimeMillis();

        while (i.get() < MAX_COUNT) {
            pool.execute(() -> {
                sendMail(mail);
                latch.countDown();
            });
            i.getAndIncrement();

        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pool.shutdown();
        System.out.println("end time: " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        System.out.println("成功发送 " + MAX_COUNT + " 封邮件,共耗时: " + (System.currentTimeMillis() - start) + "ms");
    }

    /**
     * 发送邮件
     *
     * @param mail 原型
     */
    private static void sendMail(Mail mail) {
        //创建克隆对象
        Mail clone = mail.clone();

        clone.setAppellation(randomStr(5) + "先生(女士)");
        clone.setReceiver(randomStr(5) + "@" + randomStr(8) + ".com");
        System.out.println(Thread.currentThread().getName() + " is Running~~" +
                "\n\t标题: " + clone.getSubject() +
                "\t收件人: " + clone.getReceiver() +
                "\t昵称:" + clone.getAppellation() +
                "\t-----发送成功!!");
    }


    /**
     * 获取指定长度的字符串
     *
     * @param length 要获取的字符串的长度
     * @return 指定长度的随机字符串
     */
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
