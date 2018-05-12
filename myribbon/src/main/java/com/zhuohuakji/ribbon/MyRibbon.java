package com.zhuohuakji.ribbon;

import com.netflix.client.ClientFactory;
import com.netflix.client.http.HttpRequest;
import com.netflix.client.http.HttpResponse;
import com.netflix.config.ConfigurationManager;
import com.netflix.niws.client.http.RestClient;

public class MyRibbon {
    public static void main(String[] args) throws Exception {
        ConfigurationManager.loadPropertiesFromResources("bootstrap.properties");
        RestClient client= (RestClient)ClientFactory.getNamedClient("bookkeeping");
//        HttpClientRequest request=HttpClientRequest.newBuilder().setUri(new URI("/getAllBIlls")).build();
//        HttpClientRequest.Builder request1=HttpClientRequest.newBuilder().setUri(new URI("/getAllBIlls"));
        for (int i=0;i<5;i++){
            HttpRequest request=HttpRequest.newBuilder().uri("/getBills").build();
            HttpResponse response=client.executeWithLoadBalancer(request);
        }
    }
}
