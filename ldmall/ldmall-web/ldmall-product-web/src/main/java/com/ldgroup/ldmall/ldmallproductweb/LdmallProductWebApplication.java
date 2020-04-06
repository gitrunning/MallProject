package com.ldgroup.ldmall.ldmallproductweb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class LdmallProductWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LdmallProductWebApplication.class, args);
    }

}
