package com.peikol.xiaohashu.auth.controller;

import com.peikol.framework.biz.operationlog.aspect.ApiOperationLog;
import com.peikol.framework.common.response.Response;
import com.peikol.xiaohashu.auth.model.vo.user.UpdatePasswordReqVO;
import com.peikol.xiaohashu.auth.model.vo.user.UserLoginReqVO;
import com.peikol.xiaohashu.auth.service.AuthService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author: peiko1
 * @date: 2025/11/26 15:32
 * @version: v1.0.0
 * @description: TODO
 **/
@RestController
@Slf4j
public class AuthController {

    @Resource
    private AuthService authService;

    @PostMapping("/login")
    @ApiOperationLog(description = "用户登录/注册")
    public Response<String> loginAndRegister(@Validated @RequestBody UserLoginReqVO userLoginReqVO) {
        return authService.loginAndRegister(userLoginReqVO);
    }

    @PostMapping("/logout")
    @ApiOperationLog(description = "账号登出")
    public Response<?> logout(){
        return authService.logout();
    }


    @PostMapping("/password/update")
    @ApiOperationLog(description = "修改密码")
    public Response<?> updatePassword(@Validated @RequestBody UpdatePasswordReqVO updatePasswordReqVO) {
        return authService.updatePassword(updatePasswordReqVO);
    }

}
