package com.zhouchao.spi;

import com.zhouchao.service.SpiService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @Author: zhouchao
 * @Date: 2021/09/13 11:06
 * @Description:
 */
public class SpiAdaptiveApplication {
    public static void main(String[] args) {
        URL url = URL.valueOf("test://localhost/hello?spi.service=human");
        ExtensionLoader<SpiService> extensionLoader = ExtensionLoader.getExtensionLoader(SpiService.class);
        SpiService adaptiveExtension = extensionLoader.getAdaptiveExtension();
        String s = adaptiveExtension.sayHello(url);
        System.out.println(s);
    }
}
