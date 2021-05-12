package com.kkhindigyan.org.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan({"com.kkhindigyan.org.service.aop,com.kkhindigyan.org.service.impl"})
public class MyConfig {

}
