package demo.plantB;

import demo.plantA.context.Context;
import demo.plantA.strategy.Add;
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


        switch (symbol) {
            case ADD_SYMBOL:
                System.out.println(Calculator.ADD.exec(a, b));
                break;
            case SUB_SYMBOL:
                System.out.println(Calculator.SUB.exec(a, b));
                break;
            default:
                throw new InputMismatchException();
        }

    }
}
