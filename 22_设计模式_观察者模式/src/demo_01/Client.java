package demo_01;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        Watch watchEat = new Watch(hanFeiZi, liSi, "eat");
        watchEat.start();

        Watch watchFun = new Watch(hanFeiZi, liSi, "fun");
        watchFun.start();

        while (true) {
            //然后我们看看韩非子在干什么
            Thread.sleep(5000); //主线程等待1秒后后再往下执行
            hanFeiZi.haveBreakfast();
            //韩非子娱乐了
            Thread.sleep(5000);
            hanFeiZi.haveFun();

        }
    }
}
