package com.zhuohuakeji.dao;

import com.zhuohuakeji.entity.Bill_type;

import java.util.List;

public interface BillTypeDao {
    List<Bill_type> getAllBillType();
    int saveBillType(Bill_type billType);
    int deleteBillType(int id);
    int updateBillType(Bill_type billType);
    Bill_type byIdGetBillType(int id);
}
