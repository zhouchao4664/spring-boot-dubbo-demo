package com.zhouchao.controller;

import com.zhouchao.service.ISayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/8/17
 * zhouchao
 */
@RestController
public class ComsumerController {

    @Reference
    ISayHelloService sayHelloService;

    @GetMapping("say")
    public String say(){
        return sayHelloService.sayHello("Dubbo");
    }

}
