package com.sqp.design.pattern.singleton;

/**
 * 单例模式 (饿汉式) <br>
 * <p> 1、类加载时就会创建实例
 * <p> 2、不存在线程安全问题
 * <p> 3、如果没有使用这个类, 则会造成内存浪费
 * <p> 4、实际开发中, 不推荐使用这种方式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class EagerSingleton {

    public static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    /**
     * 获取实例
     *
     * @return Singleton
     */
    public static EagerSingleton getInstance() {
        return EagerSingleton.INSTANCE;
    }
}
