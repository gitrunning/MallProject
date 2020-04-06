package com.ldgroup.ldmall.ldmallproductservice;


//import org.mybatis.spring.annotation.MapperScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = {"com.ldgroup.ldmall.ldmallproductservice.dao.mapper"})
@EnableDubbo
public class LdmallProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LdmallProductServiceApplication.class, args);
    }

}
