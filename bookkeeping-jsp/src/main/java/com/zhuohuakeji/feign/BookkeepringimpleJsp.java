package com.zhuohuakeji.feign;

import com.zhuohuakeji.api.Feignbookkeeping_Bils;
import com.zhuohuakeji.dto.BillsDto;
import org.springframework.stereotype.Component;

@Component
public class BookkeepringimpleJsp implements Feignbookkeeping_Bils {

    @Override
    public BillsDto getAllBillsDto() {
        BillsDto billsDto = new BillsDto();
        billsDto.setType_id(0);
        billsDto.setTitle("服务端的失败实现");
        return billsDto;
    }

    @Override
    public BillsDto getBillsDto() {
        return null;
    }
}
