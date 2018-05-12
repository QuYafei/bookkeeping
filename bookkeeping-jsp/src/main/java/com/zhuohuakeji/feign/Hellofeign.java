package com.zhuohuakeji.feign;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public class Hellofeign {
    public static void main(String[] args) {
//        Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
//        Fenbookkping fenbookkping=Feign.builder().encoder(new GsonEncoder(gson)).decoder(new GsonDecoder(gson)).target(Fenbookkping.class,"http://localhost:8001/");
//        System.out.println(fenbookkping.getbills().getTitle());
    }
}
