package com.cjt.authentication.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.cjt.authentication.search.dao", "com.cjt.authentication.search.mapper"})
public class MyBatisConfig {
}
