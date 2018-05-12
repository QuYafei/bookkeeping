package com.zhuohuakeji.feign;

import com.zhuohuakeji.dto.BillsDto;
import feign.RequestLine;

public interface Fenbookkping {
    @RequestLine("GET /getBills")
    BillsDto getbills();
}
