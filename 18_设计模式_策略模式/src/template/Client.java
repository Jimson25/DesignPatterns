package template;

import template.context.Context;
import template.strategy.ConcreteStrategy_1;
import template.strategy.ConcreteStrategy_2;
import template.strategy.Strategy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        String s = new Scanner(System.in).nextLine();
        switch (s) {
            case "1":
                strategy = new ConcreteStrategy_1();
                break;
            case "2":
                strategy = new ConcreteStrategy_2();
                break;
            default:
                throw new InputMismatchException();
        }
        Context context = new Context(strategy);
        context.doAnything();
    }
}
