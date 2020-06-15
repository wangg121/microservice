package com.ifindn.serviceribbon.controller;

import com.ifindn.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guo Yan
 * @date 2020/6/14-11:49
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hi(String name){

        return helloService.hiService(name);
    }
}
