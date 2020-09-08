package code;

import code.observable.HanFeiZi;
import code.observer.LiSi;
import code.observer.WangWu;
import code.observer.ZhangMaZi;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        LiSi liSi = new LiSi();
        WangWu wangWu = new WangWu();
        ZhangMaZi zhangMaZi = new ZhangMaZi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangWu);
        hanFeiZi.addObserver(zhangMaZi);

        hanFeiZi.haveBreakFast();

    }
}
