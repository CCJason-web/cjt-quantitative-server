package com.cjt.quantity.authentication.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.cjt.quantity.authentication.dao", "com.cjt.quantity.authentication.mapper"})
public class MyBatisConfig {
}
