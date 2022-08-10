package com.day06.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//定义为配置类
@Configuration
//定义扫描包
@ComponentScan("com.day06")

@Import(value = {JdbcConfig.class,TransactionConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
