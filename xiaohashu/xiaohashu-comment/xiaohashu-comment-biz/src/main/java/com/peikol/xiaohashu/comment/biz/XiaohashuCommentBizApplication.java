package com.peikol.xiaohashu.comment.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.peikol.xiaohashu")
@MapperScan("com.peikol.xiaohashu.comment.biz.domain.mapper")
public class XiaohashuCommentBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohashuCommentBizApplication.class, args);
    }

}
