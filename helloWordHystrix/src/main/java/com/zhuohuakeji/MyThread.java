package com.zhuohuakeji;

public class MyThread implements Runnable{
    @Override
    public void run() {
        HelloWordHystrix helloWordHystrix=new HelloWordHystrix();
        helloWordHystrix.execute();
    }
}
