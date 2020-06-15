package com.ifindn.servicefeign.hystric;

import com.ifindn.servicefeign.feigninterface.ScheduleServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author Guo Yan
 * @date 2020/6/14-18:18
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "soryy " + name;
    }
}
