package com.sleeve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// 扫描 mybatis 通用 mapper 所在的包
@MapperScan(basePackages = "com.sleeve.swg.mapper")
// 扫描所有包以及相关组件包
@SpringBootApplication
public class SleeveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleeveApplication.class, args);
    }

}
