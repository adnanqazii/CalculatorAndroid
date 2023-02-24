package com.example.calculator;

public class Expression {
    private double x,y;
    Expression(double a,double b) {
        x=a;
        y=b;
    }
    public double  addition() {
        return x+y;
    }
    public double  multiplication() {
        return x*y;
    }
    public double  division() {
        return x/y;
    }
    public double subtraction() {
        return x-y;
    }
}
