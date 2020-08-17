package com.zhouchao.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 2020/8/9
 * zhouchao
 */

@Path("/")
public interface ISayHelloService {

    @GET
    @Path("/say")
    String sayHello(String msg);
}
