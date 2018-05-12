package com.zhuohuakeji.dao;

import com.zhuohuakeji.entity.Bills;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillsDao {
    List<Bills> getAllBillType();
    //@Param("id") 注解形式 放置参数
    Bills byIdGetBill();
    int saveBill(Bills bills);
    int deleteBills(int id);
    int updateBills(Bills bills);
}
