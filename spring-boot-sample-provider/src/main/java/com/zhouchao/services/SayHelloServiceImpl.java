package com.zhouchao.services;

import com.zhouchao.service.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 2020/8/16
 * zhouchao
 */
@DubboService(protocol = {"dubbo", "rest"})
public class SayHelloServiceImpl implements ISayHelloService {
    @Override
    public String sayHello(String msg) {
        return "Hello," + msg;
    }
}
