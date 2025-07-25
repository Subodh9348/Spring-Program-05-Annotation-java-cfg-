package com.subodh.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.subodh.SpringBeans")
//@ComponentScan({"com.subodh.SpringBeans"})
@ComponentScan(basePackages = {"com.subodh.SpringBeans"})
public class SpringCfgFile {

}
