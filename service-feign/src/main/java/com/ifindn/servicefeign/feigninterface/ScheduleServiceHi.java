package com.ifindn.servicefeign.feigninterface;

import com.ifindn.servicefeign.hystric.ScheduleServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Guo Yan
 * @date 2020/6/14-16:35
 */
@FeignClient(value = "eureka-client-1",fallback = ScheduleServiceHiHystric.class)
@Service
public interface ScheduleServiceHi {

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(String name);

}
