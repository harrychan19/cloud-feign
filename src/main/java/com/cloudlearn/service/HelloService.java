package com.cloudlearn.service;

import com.cloudlearn.service.fallback.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hushihai
 * @version V1.0, 2019/1/26
 */
@FeignClient(value = "service-hi",fallback = HelloServiceImpl.class)
@Service
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
