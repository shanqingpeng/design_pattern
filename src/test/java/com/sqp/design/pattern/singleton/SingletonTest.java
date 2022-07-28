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
     * 单例模式 (饿汉式) 静态常量
     */
    @Test
    public void testEagerSingleton1() {
        EagerSingleton1 instance1 = EagerSingleton1.getInstance();
        EagerSingleton1 instance2 = EagerSingleton1.getInstance();
        System.out.println(instance1 == instance2);
    }

    /**
     * 单例模式 (饿汉式) 静态代码块
     */
    @Test
    public void testEagerSingleton2() {
        EagerSingleton2 instance1 = EagerSingleton2.getInstance();
        EagerSingleton2 instance2 = EagerSingleton2.getInstance();
        System.out.println(instance1 == instance2);
    }

    /**
     * 单例模式 (懒汉式) 线程不安全
     */
    @Test
    public void testLazySingleton1() {
        LazySingleton1 instance1 = LazySingleton1.getInstance();
        LazySingleton1 instance2 = LazySingleton1.getInstance();
        System.out.println(instance1 == instance2);
    }

    /**
     * 单例模式 (懒汉式) 线程安全
     */
    @Test
    public void testLazySingleton2() {
        LazySingleton2 instance1 = LazySingleton2.getInstance();
        LazySingleton2 instance2 = LazySingleton2.getInstance();
        System.out.println(instance1 == instance2);
    }

    /**
     * 单例模式 (懒汉式) 同步代码块
     */
    @Test
    public void testLazySingleton3() {
        LazySingleton3 instance1 = LazySingleton3.getInstance();
        LazySingleton3 instance2 = LazySingleton3.getInstance();
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

    /**
     * 单例模式 (通过静态内部类实现)
     */
    @Test
    public void testStaticInnerClassSingleton() {
        StaticInnerClassSingleton instance1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

    /**
     * 单例模式 (通过枚举实现)
     */
    @Test
    public void testEnumerationSingleton() {
        EnumerationSingleton instance1 = EnumerationSingleton.INSTANCE;
        EnumerationSingleton instance2 = EnumerationSingleton.INSTANCE;
        System.out.println(instance1 == instance2);
        String name = instance2.getName();
        System.out.println(name);
        instance1.sayOk();
    }

}