package com.sqp.design.pattern.factory;

import com.sqp.design.pattern.entity.Car;

/**
 * @author shanqingpeng
 * @date 2022/07/29
 */
public interface CarFactory {

    Car makeCar(String brand);

}
