package com.springStrategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuan
 */
@Configuration
@ComponentScan("com.springStrategy")
public class Config {
    @Bean
    public Strategy strategy() {
        return new OperationAdd();  //在此选择具体策略
    }
}