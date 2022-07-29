package com.sqp.design.pattern.factory;

import com.sqp.design.pattern.entity.AudiCar;
import com.sqp.design.pattern.entity.BenzCar;
import com.sqp.design.pattern.entity.BmwCar;
import com.sqp.design.pattern.entity.Car;

/**
 * 简单工厂模式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class SimpleFactory implements CarFactory {

    @Override
    public Car makeCar(String brand) {
        if ("Bmw".equals(brand)) {
            return new BmwCar();
        } else if ("Benz".equals(brand)) {
            return new BenzCar();
        } else if ("Audi".equals(brand)) {
            return new AudiCar();
        }
        return null;
    }

}