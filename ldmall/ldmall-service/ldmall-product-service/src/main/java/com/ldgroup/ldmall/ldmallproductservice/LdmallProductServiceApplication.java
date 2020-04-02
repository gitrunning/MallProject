package com.ldgroup.ldmall.ldmallproductservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.ldgroup.ldmall.ldmallproductservice.dao.mapper"})
public class LdmallProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LdmallProductServiceApplication.class, args);
    }

}
