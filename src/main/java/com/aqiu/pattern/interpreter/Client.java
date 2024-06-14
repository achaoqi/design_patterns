package com.aqiu.pattern.interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);
        context.assign(e,5);

        AbstractExpression expression=new Minus(a,new Plus(b,new Minus(c,new Plus(d,e))));
        System.out.println(expression);
        System.out.println(expression.interpret(context));
    }
}
