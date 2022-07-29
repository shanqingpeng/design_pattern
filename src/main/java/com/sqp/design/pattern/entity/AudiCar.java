package com.sqp.design.pattern.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Audi汽车
 *
 * @author shanqingpeng
 * @date 2022/07/29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AudiCar extends Car {

    public AudiCar() {
        super(3, "Audi", 300000);
    }

}
