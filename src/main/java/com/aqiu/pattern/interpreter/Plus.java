package com.aqiu.pattern.interpreter;

public class Plus extends AbstractExpression{

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    private AbstractExpression left,right;

    @Override
    public int interpret(Context context) {
        return left.interpret(context)+right.interpret(context);
    }

    @Override
    public String toString() {
        return String.format("%s + %s",left,right);
    }
}
