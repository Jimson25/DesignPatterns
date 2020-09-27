package demo_01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Client {
    //运行四则运算
    public static void main(String[] args) throws IOException {
        //获取表达式
        String expStr = getExpStr();
        //给表达式的参数赋值，这里要传入表达式作为参数是为了判断表达式需要几个参数
        HashMap<String, Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为：" + expStr + "=" + cal.run(var));
    }

    //获得表达式
    public static String getExpStr() {
        System.out.print("请输入表达式：");
        return new Scanner(System.in).nextLine();
    }

    //获得值映射
    public static HashMap<String, Integer> getValue(String exprStr) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //解析有几个参数要传递
        for (char ch : exprStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                //解决重复参数的问题
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入参数: ");
                    String in = new Scanner(System.in).nextLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
