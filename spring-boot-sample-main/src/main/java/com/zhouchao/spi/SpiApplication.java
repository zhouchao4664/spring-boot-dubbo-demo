package com.zhouchao.spi;

import com.zhouchao.service.SpiService;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Set;

/**
 * @Author: zhouchao
 * @Date: 2021/09/10 11:18
 * @Description:
 */
public class SpiApplication {
    public static void main(String[] args) {
        // 获取扩展加载器
        ExtensionLoader<SpiService> extensionLoader = ExtensionLoader.getExtensionLoader(SpiService.class);
        SpiService dog = extensionLoader.getExtension("dog");
        System.out.println("result:" + dog.print());

        SpiService human = extensionLoader.getExtension("human");
        System.out.println("result:" + human.print());

        Set<String> spiServiceSet = extensionLoader.getLoadedExtensions();
        for (String s : spiServiceSet) {
            String print = extensionLoader.getExtension(s).print();
            System.out.println("result:" + print);
        }
    }
}
