package com.cjt.quantity.common.classloader;

public class TwoNum {

    public int twoNum(Integer a, Integer b) {
        return a+b;
    }

    public static void main(String[] args) {
        TwoNum twoNum = new TwoNum();
        System.out.println(twoNum.twoNum(1,2));
    }
}
