package com.cloudlearn.controller;

import com.cloudlearn.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hushihai
 * @version V1.0, 2019/1/26
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return "from feign:"+helloService.sayHiFromClientOne(name);
    }
}
