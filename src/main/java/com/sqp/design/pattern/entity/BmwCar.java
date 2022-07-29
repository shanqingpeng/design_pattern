package com.sqp.design.pattern.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Bmw汽车
 *
 * @author shanqingpeng
 * @date 2022/07/29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BmwCar extends Car {

    public BmwCar() {
        super(1, "BMW", 320000);
    }

}
