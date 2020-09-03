package demo_01;

public class HanFeiZi implements IHanFeiZi {
    private boolean isHaveBreakfast = false;
    private boolean isHavingFun = false;


    @Override
    public void haveBreakfast() {
        System.out.println("HanFeiZi.haveBreakfast");
        this.isHaveBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("HanFeiZi.haveFun");
        this.isHavingFun = true;
    }


    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        isHaveBreakfast = haveBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
