package mediator.simple;

/**
 * 采购管理类
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 购买IBM电脑
     * @param number 购买的电脑数
     */
    public void buyIBMComputer(int number) {
        System.out.println("购买 " + number + "台IBM电脑");
    }

    /**
     * 停止购买IBM电脑
     */
    public void refuseBuyIBM(){
        System.out.println("不再购买IBM电脑");
    }
}
