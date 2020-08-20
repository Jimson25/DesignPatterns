package mediator.simple;

/**
 * 具体中介者
 */
public class Mediator extends AbstractMediator {


    @Override
    public void execute(String str, Object... objects) {
        switch (str) {
            case "purchase.buy":
        }
    }

    /**
     * 采购电脑
     *
     * @param number 采购电脑数量
     */
    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑" + number + "台");
            super.stock.increase(number);
        } else {
            number /= 2;
            System.out.println("采购IBM电脑" + number + "台");
            super.stock.increase(number);
        }
    }

    /**
     * 销售电脑
     *
     * @param number 卖掉的电脑数
     */
    public void sellComputer(int number) {
        if (super.stock.getComputerNumber() < number) {
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decurease(number);
    }

    /**
     * 折价销售电脑
     */
    private void offSell() {
        System.out.println("折价销售电脑" + super.stock.getComputerNumber() + "台");
    }

    /**
     * 清仓处理
     */
    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }


}
