package com.example.task1;

import com.example.task1.JavaConfiguration.Configuration;
import com.example.task1.JavaConfiguration.Max;
import com.example.task1.JavaConfiguration.Peta;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Peta peta = context.getBean("peta", Peta.class);
        Max max = context.getBean("max", Max.class);
        peta.printAge();
        max.printAge();
        max.printJob();
    }
}
