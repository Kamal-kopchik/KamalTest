package com.company;

public class Rational {
    private int val1;
    private int val2;
    private String sign;
    private String result;

    public int getVal1() {
        return val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public void setSign(String value) {
        if (value.contains("+")) {
            sign = "+";
        } else if (value.contains("-")) {
            sign = "-";
        } else if (value.contains("*")) {
            sign = "*";
        } else if (value.contains("/")) {
            sign = "/";
        } else {
            throw new RuntimeException("Sign is empty!!");
        }
    }

    public String getSign() {
        return sign;
    }

    public double division() {
        return (double) getVal1() / getVal2();
    }

    public int multiply() {
        return getVal1() * getVal2();
    }

    public int add() {
        return getVal1() + getVal2();
    }

    public int subtract() {
        return getVal1() - getVal2();
    }

    public void calculate(){
        switch (sign){
            case "+":
                result = String.valueOf(add());
                break;
            case "-":
                result = String.valueOf(subtract());
                break;
            case "*":
                result = String.valueOf(multiply());
                break;
            case "/":
                result = String.valueOf(division());
                break;
        }
    }

    @Override
    public String toString() {
        return String.format("%d %s %d = %s", getVal1(), getSign(), getVal2(), result);
    }
}
