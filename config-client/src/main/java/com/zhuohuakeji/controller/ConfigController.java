package com.zhuohuakeji.controller;

import com.zhuohuakeji.config.ConfigProper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Autowired
    private ConfigProper configProper;
    @GetMapping("/get")
    public String getConfigProperattribute(){
        return "用户"+configProper.getUsername()+"\t密码"+configProper.getPassword()+"\t链接字符串"+configProper.getUrl();
    }
}