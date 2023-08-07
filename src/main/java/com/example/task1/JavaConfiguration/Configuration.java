package com.example.task1.JavaConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.example.task1.JavaConfiguration")
@PropertySource("classpath:application.properties")
public class Configuration {

}
