package com.pet.controller;

import com.pet.interfaces.IService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by liyut on 2017-12-11.
 */
@Controller
public class MyController {
    @Resource
    private IService iService;
    @RequestMapping("/test.do")
    public String gettest(){
        System.out.printf("我来了");
        String hello=iService.hello();
        System.out.printf(hello);
        return "welcome";
    }
}
