package com.sqp.design.pattern.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 汽车
 *
 * @author shanqingpeng
 * @date 2022/07/29
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Car {

    private Integer id;

    private String brand;

    private Integer price;

}
