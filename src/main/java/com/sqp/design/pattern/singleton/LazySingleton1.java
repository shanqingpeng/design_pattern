package com.sqp.design.pattern.singleton;

/**
 * 单例模式 (懒汉式) 第1种 (线程不安全) <br>
 * <p> 1、调用静态方法时才会创建实例, 起到了懒加载的作用
 * <p> 2、单线程环境可以使用, 多线程环境存在线程安全问题
 * <p> 3、实际开发中, 不能使用这种方式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class LazySingleton1 {

    public static LazySingleton1 instance = null;

    private LazySingleton1() {

    }

    public static LazySingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }
}