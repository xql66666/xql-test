package com.xuqianlei.spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AppConfig class
 *
 * @author qianlei.xu
 * @date 2020/10/28
 */
@Configuration
@ComponentScan("com.xuqianlei.spring")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}
