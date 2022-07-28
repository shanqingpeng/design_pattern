package com.sqp.design.pattern.singleton;

/**
 * 单例模式 (懒汉式) 第2种 (线程安全) <br>
 * <p> 1、使用同步方法, 线程安全
 * <p> 2、多线程环境下, 效率很低
 * <p> 3、调用静态方法时才会创建实例, 起到了懒加载的作用
 * <p> 4、实际开发中, 不推荐使用这种方式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class LazySingleton2 {

    public static LazySingleton2 instance = null;

    private LazySingleton2() {

    }

    public synchronized static LazySingleton2 getInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
        }
        return instance;
    }
}