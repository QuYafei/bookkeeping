package com.zhuohuakeji;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolProperties;
import com.netflix.hystrix.strategy.properties.HystrixPropertiesCommandDefault;

public class HelloWordHystrix extends HystrixCommand<String> {
    public HelloWordHystrix(){
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("first"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                        .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.SEMAPHORE))
                .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withQueueSizeRejectionThreshold(10))
        .andCommandPropertiesDefaults(HystrixCommandProperties.Setter().withExecutionIsolationSemaphoreMaxConcurrentRequests(10))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter().withFallbackIsolationSemaphoreMaxConcurrentRequests(50)));
    }

    @Override
    protected String run() throws Exception {
//        throw new Exception();
//        System.out.println("你好");
        while (true){
            System.out.println(1);
        }
//        return null;
    }

    @Override
    protected String getFallback() {
        System.out.println("异常了");
        return "异常";
    }
}
