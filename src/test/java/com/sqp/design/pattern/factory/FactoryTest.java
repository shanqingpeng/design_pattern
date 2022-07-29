package com.sqp.design.pattern.factory;

import com.sqp.design.pattern.entity.Car;
import org.junit.Test;

/**
 * 工厂模式 (测试)
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class FactoryTest {

    @Test
    public void testSimpleFactory() {

        SimpleFactory simpleFactory = new SimpleFactory();
        Car bmw = simpleFactory.makeCar("Bmw");
        Car benz = simpleFactory.makeCar("Benz");
        Car audi = simpleFactory.makeCar("Audi");
        System.out.println(bmw);
        System.out.println("benz: " + benz);
        System.out.println("audi: " + audi);
    }

}
