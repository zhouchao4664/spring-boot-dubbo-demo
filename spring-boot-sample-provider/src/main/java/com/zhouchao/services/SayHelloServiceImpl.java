package com.zhouchao.services;

import com.zhouchao.service.ISayHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 2020/8/16
 * zhouchao
 */
@Service
public class SayHelloServiceImpl implements ISayHelloService {
    @Override
    public String sayHello(String msg) {
        return "Hello,"+msg;
    }
}
