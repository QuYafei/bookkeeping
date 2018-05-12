package com.zhuohuakeji.service;

import com.netflix.discovery.converters.Auto;
import com.zhuohuakeji.api.BillTypeServiceImp;
import com.zhuohuakeji.dao.BillTypeDao;
import com.zhuohuakeji.dto.Bill_typeDto;
import com.zhuohuakeji.entity.Bill_type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillTypeService implements BillTypeServiceImp{
    @Autowired
    private BillTypeDao billTypeDao;
    @Override
    public List<Bill_typeDto> getAllbillType(){
        List<Bill_type> allBillType = billTypeDao.getAllBillType();
        return null;
    }
}
