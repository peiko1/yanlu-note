package com.peikol.xiaohashu.user.relation.biz;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.peikol.xiaohashu.user.relation.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.peikol.xiaohashu")
public class XiaohashuUserRelationBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohashuUserRelationBizApplication.class, args);
    }

}
