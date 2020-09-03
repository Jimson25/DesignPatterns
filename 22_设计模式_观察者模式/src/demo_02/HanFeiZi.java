package demo_02;

public class HanFeiZi implements IHanFeiZi {
    //    private boolean isHaveBreakfast = false;
//    private boolean isHavingFun = false;
    private LiSi lisi = new LiSi();


    @Override
    public void haveBreakfast() {
        System.out.println("HanFeiZi.haveBreakfast");
        this.lisi.update("eat");
    }

    @Override
    public void haveFun() {
        System.out.println("HanFeiZi.haveFun");
        this.lisi.update("fun");
    }


}
