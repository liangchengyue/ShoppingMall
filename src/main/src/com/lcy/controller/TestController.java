package com.lcy.controller;

import com.lcy.pojo.Test;
import com.lcy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
    @RequestMapping("/addTest")
    @ResponseBody
    public String addTest(){
        Test test=new Test();
        test.setName("测试");
        testService.addTest(test);
        return "ok";
    }
}
