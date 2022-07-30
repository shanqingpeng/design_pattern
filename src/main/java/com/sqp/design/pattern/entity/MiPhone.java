package com.sqp.design.pattern.entity;

import lombok.EqualsAndHashCode;

/**
 * Bmw汽车
 *
 * @author shanqingpeng
 * @date 2022/07/29
 */
@EqualsAndHashCode(callSuper = true)
public class MiPhone extends Phone {

    @Override
    public String getName() {
        return "小米";
    }

}
