package com.peikol.framework.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: peiko1
 * @date: 2025-11-26 10:33
 * @description: 逻辑删除
 **/
@Getter
@AllArgsConstructor
public enum DeletedEnum {

    YES(true),
    NO(false);

    private final Boolean value;
}
