package com.cjt.quantity.common.utils;

public class Test implements Runnable{
    private String num;
    public Test(String num) {
        super();
        this.num=num;
    }

    @Override
    public void run() {
        System.out.println("Starting" + num);

        for(int i=1; i<=10; i++) {
            System.out.println("Executing" + num + " with" + Thread.currentThread());
        }

        System.out.println("Ending" + num);

    }
}
