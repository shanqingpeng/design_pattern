package com.sqp.design.pattern.singleton;

/**
 * 单例模式 (双重检查) <br>
 * <p>
 * <p>
 * <p>
 * <p>
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
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
