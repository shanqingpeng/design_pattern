package com.sqp.design.pattern.entity;

import lombok.EqualsAndHashCode;

/**
 * Benz汽车
 *
 * @author shanqingpeng
 * @date 2022/07/29
 */
@EqualsAndHashCode(callSuper = true)
public class OppoPhone extends Phone {

    @Override
    public String getName() {
        return "欧珀";
    }

}