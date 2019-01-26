package com.cloudlearn.service.fallback;

import com.cloudlearn.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hushihai
 * @version V1.0, 2019/1/26
 */
@Service
public class HelloServiceImpl implements HelloService {

     private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHiFromClientOne(@RequestParam(value = "name") String name){
        log.error("sayHiFromClientOne请求服务错误"+name);
        return null;
    }

}
