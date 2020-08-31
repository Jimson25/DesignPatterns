package code_1;

import code_1.context.Context;
import code_1.strategy.BackDoorStrategy;
import code_1.strategy.BlockEnemyStrategy;
import code_1.strategy.GivenGreenLightStrategy;

public class Client {
    public static void main(String[] args) {
        Context context;
        System.out.println("执行策略1");
        context = new Context(new BackDoorStrategy());
        context.operate();
        System.out.println("执行策略2");
        context = new Context(new GivenGreenLightStrategy());
        context.operate();
        System.out.println("执行策略3");
        context = new Context(new BlockEnemyStrategy());
        context.operate();

    }
}
