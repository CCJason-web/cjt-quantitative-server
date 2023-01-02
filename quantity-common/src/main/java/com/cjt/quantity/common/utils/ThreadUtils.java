package com.cjt.quantity.common.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadUtils {

    public static void getThreadPool() {

        ExecutorService threadPool1 = Executors.newFixedThreadPool(3);

        for (int i=1; i<=100; i++) {
            Test test = new Test("LoopTask " +i);
            threadPool1.submit(test);
        }
        threadPool1.shutdown();

    }

    public static void main(String[] args) {
        getThreadPool();
    }

}
