package com.peikol.xiaohashu.user.constant;

/**
 * @author: peiko1
 * @date: 2025/11/26 15:04
 * @version: v1.0.0
 * @description: 角色全局常量
 **/
public class RoleConstants {


    /**
     * 普通用户的角色 ID
     */
    public static final Long COMMON_USER_ROLE_ID = 1L;
    /**
     * 用户角色数据 KEY 前缀
     */
    private static final String USER_ROLES_KEY_PREFIX = "user:roles:";


    /**
     * 构建用户-角色 Key
     * @param phone
     * @return
     */
    public static String buildUserRoleKey(String phone) {
        return USER_ROLES_KEY_PREFIX + phone;
    }

}
