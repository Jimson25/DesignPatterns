package mediator.simple;

import java.util.Random;

/**
 * 销售类
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 销售IBM电脑
     *
     * @param number 卖出的电脑数量
     */
    public void sellIBMComoputer(int number) {
        super.mediator.execute("salc.sell", number);
    }

    /**
     * 获取销售状况
     *
     * @return 销售情况
     */
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int i = random.nextInt(100);
        System.out.println("IBM电脑销售状况为:" + i + "台");
        return i;
    }

    /**
     * 折价处理
     */
    public void offSale() {
        super.mediator.execute("sale.offsell");
    }

}
