package com.sqp.design.pattern.singleton;

/**
 * 单例模式 (懒汉式) 第3种 (同步代码块) <br>
 * <p> 1、不能解决线程安全问题
 * <p> 2、调用静态方法时才会创建实例, 起到了懒加载的作用
 * <p> 2、实际开发中, 不能使用这种方式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class LazySingleton3 {

    public static LazySingleton3 instance = null;

    private LazySingleton3() {

    }

    public static LazySingleton3 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                instance = new LazySingleton3();
            }
        }
        return instance;
    }
}