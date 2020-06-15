package com.ifindn.servicefeign.controller;

import com.ifindn.servicefeign.feigninterface.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guo Yan
 * @date 2020/6/14-16:37
 */
@RestController
public class HiController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;

    @GetMapping("/hi")
    public String   sayHi(String name){
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
