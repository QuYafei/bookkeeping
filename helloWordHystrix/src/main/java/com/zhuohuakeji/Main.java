package com.zhuohuakeji;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        HelloWordHystrix helloWordHystrix=new HelloWordHystrix();
//        helloWordHystrix.execute();
        for (int i=0;i<50;i++){
            new Thread(new MyThread()).start();
        }
    }
}
