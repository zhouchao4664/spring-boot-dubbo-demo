package com.zhouchao.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * 2020/8/9
 * zhouchao
 */

@Path("/")
public interface ISayHelloService {

    @GET
    @Path("/say")
    String sayHello(@QueryParam("msg") String msg);
}
