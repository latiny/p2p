package com.latiny.p2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liujinwei
 * @version 1.0
 * @description: TODO
 * @date 2019/6/24 21:45
 */

@SpringBootApplication(scanBasePackages = "com.latiny")
@MapperScan("com.latiny.p2p.mapper")
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
