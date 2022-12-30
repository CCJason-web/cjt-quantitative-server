package com.cjt.quantity.common.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadUtils {

    public static void getThreadPool() {
        ExecutorService threadPool1 = Executors.newFixedThreadPool(40);
    }
}
