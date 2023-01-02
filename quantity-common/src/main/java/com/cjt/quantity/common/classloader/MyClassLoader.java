package com.cjt.quantity.common.classloader;

import java.io.*;

public class MyClassLoader extends ClassLoader{
    private String codePath;

    public MyClassLoader(ClassLoader parent, String codePath){
        super(parent);
        this.codePath = codePath;
    }

    public MyClassLoader(String codePath) {
        this.codePath = codePath;
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        BufferedInputStream bis=null;
        ByteArrayOutputStream bos=null;
        codePath=codePath+name.replace(".", File.separator)+".class";
        byte[] bytes=new byte[1024];
        int line=0;
        try{
            //读取编译后的文件
            bis=new BufferedInputStream(new FileInputStream(codePath));
            bos=new ByteArrayOutputStream();
            while((line= bis.read(bytes))!=-1){
                bos.write(bytes,0,line);
            }
            bos.flush();
            bytes=bos.toByteArray();
            return defineClass(null,bytes,0,bytes.length);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return super.findClass(name);
    }

}
