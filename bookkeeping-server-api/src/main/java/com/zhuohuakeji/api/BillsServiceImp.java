package com.zhuohuakeji.api;

import com.zhuohuakeji.dto.BillsDto;
import com.zhuohuakeji.vo.BillsVO;
import org.jboss.logging.Param;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface BillsServiceImp {
    /**
     * 获取所有billsDto
     * @return
     */
    @GetMapping("/getAllBIlls")
    BillsDto getAllBillsDto();
    //参数注解形式  @Param Integer id
    @GetMapping("/getBillsDto")
    BillsDto getBillsDto();
//    int saveBills(BillsVO billsVO);
//    int byIdDelectBills(int id);
//    int updateBills(BillsVO vo);

}
