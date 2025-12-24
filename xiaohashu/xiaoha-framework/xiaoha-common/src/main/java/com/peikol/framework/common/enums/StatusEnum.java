package com.peikol.framework.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: peiko1
 * @date: 2025-11-26 10:33
 * @description: 状态
 **/
@Getter
@AllArgsConstructor
public enum StatusEnum {
    // 启用
    ENABLE(0),
    // 禁用
    DISABLED(1);

    private final Integer value;
}

