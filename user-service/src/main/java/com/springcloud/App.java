package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ Author     ：ShaoWei Sun.
 * @ Date       ：Created in 11:52 2018/11/30
 */
@SpringBootApplication
@MapperScan("com.springcloud.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
