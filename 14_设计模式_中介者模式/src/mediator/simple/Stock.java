package mediator.simple;

/**
 * 库存管理
 */
public class Stock extends AbstractColleague {
    private static int computerNumber = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 库存增加
     *
     * @param number 新增加的库存
     */
    public void increase(int number) {
        computerNumber += number;
        System.out.println("电脑库存为:" + computerNumber + "台");
    }

    /**
     * 库存减少
     *
     * @param number 减少的库存
     */
    public void decurease(int number) {
        computerNumber -= number;
        System.out.println("电脑库存为:" + (Math.max(computerNumber, 0)) + "台");
    }

    /**
     * 获取库存数量
     *
     * @return 库存数
     */
    public int getComputerNumber() {
        return computerNumber;
    }

    /**
     * 库存紧张,提醒清理库存
     */
    public void clearStock() {
        System.out.println("仓库空间不足,当前库存总数为: " + getComputerNumber());
        super.mediator.execute(Common.STOCK_CLEAR);
    }
}
