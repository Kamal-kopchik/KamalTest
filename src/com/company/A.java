package com.company;

public class A {
    int i=6;
    static int k=2;

    public static void main(String[] args) {
        A a=new A();
        int j=a.i;
        a.m1();
        System.out.println(a.i);
    }
    public void m1(){
        i=1+k+m2(i,k);
    }
    public static int m2(int i,int k){
        return (int) Math.pow(i,k);
    }
}
