package demo_01.expression.var;

import demo_01.expression.Expression;

import java.util.HashMap;

/**
 * 变量解析
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
