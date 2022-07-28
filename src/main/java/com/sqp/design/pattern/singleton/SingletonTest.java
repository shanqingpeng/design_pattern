package com.sqp.design.pattern.singleton;

import org.junit.Test;

/**
 * 单例模式 (测试)
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class SingletonTest {

    /**
     * 单例模式 (饿汉式)
     */
    @Test
    public void testEagerSingleton() {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

    /**
     * 单例模式 (懒汉式)
     */
    @Test
    public void testLazySingleton() {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

    /**
     * 单例模式 (双重检查)
     */
    @Test
    public void testDoubleCheckSingleton() {
        DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton instance2 = DoubleCheckSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}
