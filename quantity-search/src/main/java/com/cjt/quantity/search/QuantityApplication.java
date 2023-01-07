// Created by Jason

package com.cjt.quantity.search;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cjt.quantity")
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class QuantityApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuantityApplication.class, args);
    }
}
