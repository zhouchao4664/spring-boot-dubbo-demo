package com.zhouchao.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @Author: zhouchao
 * @Date: 2021/09/09 16:10
 * @Description:
 */
@SPI
public interface SpiService {

    /**
     * sqi测试接口
     *
     * @return
     */
    String print();

    /**
     * 测试Adaptive动态选择
     *
     * @param url
     * @return
     */
    @Adaptive
    String sayHello(URL url);
}
