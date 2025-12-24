package com.peikol.xiaohashu.data.align;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.peikol.xiaohashu.data.align.domain.mapper")
public class XiaohashuDataAlignApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohashuDataAlignApplication.class, args);
    }

}
