package demo.plantA;

import demo.plantA.context.Context;
import demo.plantA.strategy.Add;
import demo.plantA.strategy.Calculator;
import demo.plantA.strategy.Sub;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    private static final String ADD_SYMBOL = "+";
    private static final String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("参数1:");
        int a = scanner.nextInt();
        System.out.print("参数2:");
        int b = scanner.nextInt();
        System.out.print("运算符:");
        String symbol = new Scanner(System.in).nextLine();

        Calculator calculator = null;

        switch (symbol) {
            case ADD_SYMBOL:
                calculator = new Add();
                break;
            case SUB_SYMBOL:
                calculator = new Sub();
                break;
            default:
                throw new InputMismatchException();
        }

        Context context = new Context(calculator);
        System.out.println(context.exec(a, b));
    }


}
