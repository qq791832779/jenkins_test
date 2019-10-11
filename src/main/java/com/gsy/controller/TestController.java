package com.gsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created: apple
 * @Date: 2019-10-11 21:38
 * @Description:
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "接口访问成功";
    }

}
