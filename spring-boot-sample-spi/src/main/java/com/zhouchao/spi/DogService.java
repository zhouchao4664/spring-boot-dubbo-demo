package com.zhouchao.spi;

import com.zhouchao.service.SpiService;
import org.apache.dubbo.common.URL;

/**
 * @Author: zhouchao
 * @Date: 2021/09/09 16:18
 * @Description:
 */
public class DogService implements SpiService {
    @Override
    public String print() {
        return "Dog";
    }

    @Override
    public String sayHello(URL url) {
        return "wang wang";
    }
}
