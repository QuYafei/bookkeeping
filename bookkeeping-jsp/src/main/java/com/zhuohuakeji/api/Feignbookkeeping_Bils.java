package com.zhuohuakeji.api;

import com.zhuohuakeji.feign.BookkeepringimpleJsp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Primary;

@Primary
@FeignClient(value = "BOOKKEEPING-SERVER",fallback = BookkeepringimpleJsp.class)//feign注解 value对应Eureka中的服务名称 fallback表示如果出错了会进入那个类中
public interface Feignbookkeeping_Bils extends BillsServiceImp {

}
