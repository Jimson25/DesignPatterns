package demo_01;

import demo_01.expression.Expression;
import demo_01.expression.symbol.AddExpression;
import demo_01.expression.symbol.SubExpression;
import demo_01.expression.var.VarExpression;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解析器封装类
 */
public class Calculator {
    //定义表达式
    private Expression expression;

    /**
     * 这个构造方法是为了将字符串表达式转换为一个表达式对象，即将“a+b-c”字符串 解析为 a+b-c数学表达式
     * 解析传入的表达式字符串并将其解释为数学表达式，将运算表达式保存到expression对象
     *
     * @param expStr
     */
    public Calculator(String expStr) {
        //定义一个栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack();
        //表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();
        //运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+': //加法
                    //加法结果放到栈中
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:  //公式中的变量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        //把运算结果抛出来
        this.expression = stack.pop();
    }

    //开始运算
    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
