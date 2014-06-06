package com.ekart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.ekart.rest","com.ekart.service","com.ekart.dao"})
public class AppConfig {

}
