package com.sqp.design.pattern.entity;

import lombok.EqualsAndHashCode;

/**
 * Audi汽车
 *
 * @author shanqingpeng
 * @date 2022/07/29
 */
@EqualsAndHashCode(callSuper = true)
public class HuaweiPhone extends Phone {

    @Override
    public String getName() {
        return "华为";
    }

}