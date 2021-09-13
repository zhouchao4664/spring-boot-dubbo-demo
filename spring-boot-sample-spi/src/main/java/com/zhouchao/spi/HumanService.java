package com.zhouchao.spi;

import com.zhouchao.service.SpiService;
import org.apache.dubbo.common.URL;

/**
 * @Author: zhouchao
 * @Date: 2021/09/09 16:16
 * @Description:
 */
public class HumanService implements SpiService {
    @Override
    public String print() {
        return "human";
    }

    @Override
    public String sayHello(URL url) {
        return "你好";
    }
}
