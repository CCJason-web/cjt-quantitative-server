package com.cjt.quantity.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.cjt.quantity.search.dao", "com.cjt.quantity.search.mapper"})
public class MyBatisConfig {
}
