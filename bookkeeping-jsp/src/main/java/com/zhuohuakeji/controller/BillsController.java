package com.zhuohuakeji.controller;

import com.zhuohuakeji.api.Feignbookkeeping_Bils;
import com.zhuohuakeji.dto.BillsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillsController {
    @Autowired
    Feignbookkeeping_Bils feignbookkeeping_bils;
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/getAllBills")
    public BillsDto getAllBills(){
//        ResponseEntity<BillsDto> forEntity = restTemplate.getForEntity("http://BOOKKEEPING-SERVER/getBills", BillsDto.class);
        BillsDto allBillsDto = feignbookkeeping_bils.getAllBillsDto();
        return allBillsDto;
//        return forEntity.getBody();
    }
}
