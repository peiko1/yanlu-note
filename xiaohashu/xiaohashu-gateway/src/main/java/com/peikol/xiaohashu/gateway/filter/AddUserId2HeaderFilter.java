package com.peikol.xiaohashu.gateway.filter;

import cn.dev33.satoken.stp.StpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


@Component
@Slf4j
@Order(-90)
public class AddUserId2HeaderFilter implements GlobalFilter {

    /**
     * 请求头中，用户 ID 的键
     */
    private static final String HEADER_USER_ID = "userId";


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("==================> TokenConvertFilter");

        // 用户 ID
        Long userId = null;
        try{
            // 获取当前登录用户的ID
            userId = StpUtil.getLoginIdAsLong();
            // 通过 SaToken 工具类获取当前用户 ID。如果请求中携带了 Token 令牌，则会获取成功；
            // 如果未携带，能执行到这里，说明请求的接口无需权限校验，这个时候获取用户 ID 会报抛异常
        }catch (Exception e){
            // 若没有登录，则直接放行  catch() 到异常后，不做任何修改，将请求传递给过滤器链中的下一个过滤器，发行请求即可
            return chain.filter(exchange);
        }

        log.info("## 当前登录的用户 ID: {}", userId);

        // exchange表示当前HTTP请求和响应的上下文，可以通过它来获取和修改请求和响应
        // 将请求传递给过滤器链中的下一个过滤器进行处理。没有对请求进行任何修改
        Long finalUserId = userId;
        ServerWebExchange newExchange = exchange.mutate()
                .request(builder -> builder.header(HEADER_USER_ID, String.valueOf(finalUserId))) // 将用户 ID 设置到请求头中
                .build();
        return chain.filter(newExchange);
    }
}

