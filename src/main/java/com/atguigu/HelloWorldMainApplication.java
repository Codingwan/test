package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 表明主程序
* 说明是一个spring boot应用
* */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        /*
        * spring应用跑起来
        * */
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
