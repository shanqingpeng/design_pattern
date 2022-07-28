package com.sqp.design.pattern.singleton;

/**
 * 单例模式 (双重检查) <br>
 * <p> 1、线程安全
 * <p> 2、实现了懒加载
 * <p> 3、实际开发中, 推荐使用这种方式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton1.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}