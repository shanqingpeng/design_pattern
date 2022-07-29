package com.sqp.design.pattern.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Benz汽车
 *
 * @author shanqingpeng
 * @date 2022/07/29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BenzCar extends Car {

    public BenzCar() {
        super(2, "Benz", 350000);
    }

}
