package com.demo.proxy.springAnnoProxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yuan
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.demo.proxy.springAnnoProxy")
public class Config {
    @Bean
    public Internet internet() {
        return new RealInternet();
    }
}
