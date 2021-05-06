package mediator.simple;

public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("\n====== 采购电脑 ======\n");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);

        System.out.println("\n====== 销售电脑 ======\n");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(10);

        System.out.println("\n====== 管理库存 ======\n");
        Stock stock = new Stock(mediator);
        stock.clearStock();

    }


}
