package com.sqp.design.pattern.singleton;

/**
 * 单例模式 (通过静态内部类实现) <br>
 * <p> 1、外部类被加载时, 静态内部类不会立即被加载
 * <p> 2、外部类使用内部类中属性时, 会导致内部类的加载, 而且只会加载一次
 * <p> 3、实现了懒加载, 内部类加载时是线程安全的, 所以没有线程安全问题
 * <p> 4、实际开发中, 推荐使用这种方式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    /**
     * 1、外部类被加载时, 内部类不会立即被加载
     * 2、内部类加载时, 是线程安全的, 而且只会加载一次
     */
    private static class InnerClass {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        // 外部类使用内部类中属性时, 会导致内部类的加载, 而且只会加载一次
        return InnerClass.INSTANCE;
    }

}