package com.peikol.xiaohashu.auth.service;

import com.peikol.framework.common.response.Response;
import com.peikol.xiaohashu.auth.model.vo.user.UpdatePasswordReqVO;
import com.peikol.xiaohashu.auth.model.vo.user.UserLoginReqVO;

/**
 * @author: peiko1
 * @date: 2025/11/26 15:41
 * @version: v1.0.0
 * @description: TODO
 **/
public interface AuthService {

    /**
     * 登录与注册
     * @param userLoginReqVO
     * @return
     */
    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);

    /**
     * 退出登录
     * @return
     */
    Response<?> logout();

    /**
     * 修改密码
     * @param updatePasswordReqVO
     * @return
     */
    Response<?> updatePassword(UpdatePasswordReqVO updatePasswordReqVO);

}

