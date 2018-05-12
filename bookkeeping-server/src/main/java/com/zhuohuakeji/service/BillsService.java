package com.zhuohuakeji.service;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhuohuakeji.api.BillsServiceImp;
import com.zhuohuakeji.dao.BillsDao;
import com.zhuohuakeji.dto.BillsDto;
import com.zhuohuakeji.entity.Bills;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nullable;
import java.util.List;
@RestController
public class BillsService implements BillsServiceImp {

    @Value("${server.port}")
    private int port;
    @Autowired
    private BillsDao billsDao;
    @GetMapping("/getAllBIlls")
//    @HystrixCommand(fallbackMethod = "getAllBillsEorr",commandProperties = {@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "2")})
    @Override
    public BillsDto getAllBillsDto() {
        int error=1/0;
        List<Bills> allBillType = billsDao.getAllBillType();
        List<BillsDto> billsDtoList= Lists.transform(allBillType, new Function<Bills, BillsDto>() {
            @Nullable
            @Override
            public BillsDto apply(@Nullable Bills input) {
                BillsDto billsDto=new BillsDto();
                BeanUtils.copyProperties(input,billsDto);
                return billsDto;
            }
        });
        return billsDtoList.get(0);
    }

    @Override
    @GetMapping("/getBills")
    //@PathVariable Integer id 注解获取参数
    public BillsDto getBillsDto() {
        Bills bills = billsDao.byIdGetBill();
        BillsDto dto=new BillsDto();
        dto.setId(bills.getId());
        dto.setTitle(bills.getTitle());
        dto.setBill_time(bills.getBill_time());
        dto.setCxplain(bills.getCxplain());
        dto.setPrice(bills.getPrice());
        dto.setType_id(port);
        System.out.println("##########################################");
        System.out.println(port);
        return dto;
    }

    public BillsDto getAllBillsEorr() {
        BillsDto billsDto = new BillsDto();
        billsDto.setTitle("错误");
        return billsDto;
    }
    //    @Override
//    public int saveBills(BillsVO billsVO) {
//        return 0;
//    }
//
//    @Override
//    public int byIdDelectBills(int id) {
//        return 0;
//    }

//    @Override
//    public int updateBills(BillsVO vo) {
//        int i = billsDao.updateBills(vo.getBills());
//        return i;
//    }
}