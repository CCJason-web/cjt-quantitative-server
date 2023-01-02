package com.cjt.quantity.common.classloader;

import java.lang.reflect.Method;

public class TestClassLoader {


    public static void main(String[] args) throws Exception {
        String codePath="/Users/mac/myProject/cjt-quantitative-server/quantity-common/src/main/java";
        MyClassLoader myClassLoader=new MyClassLoader(codePath);
        Class<?> aClass = myClassLoader.loadClass("com.cjt.quantity.common.classloader.TwoNum");
        System.out.println(aClass.getClassLoader().getClass().getName()+" Load");
        // Use the reflection instance object function and invoke class
        Object o = aClass.newInstance();
        Method twoNum = aClass.getDeclaredMethod("twoNum", Integer.class, Integer.class);
        Object invoke = twoNum.invoke(o, 10, 23);
        System.out.println(invoke);
    }
}
