package demo_01.expression.symbol;

import demo_01.expression.Expression;
import demo_01.expression.symbol.SymbolExpression;

import java.util.HashMap;

/**
 * 加法运算类
 */
public class AddExpression extends SymbolExpression {


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
