package com.sqp.design.pattern.singleton;

/**
 * 单例模式 (通过枚举实现) <br>
 * <p> 1、不仅能避免多线程的安全问题, 还能防止反序列化重新创建对象
 * <p> 2、实际开发中, 推荐使用这种方式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public enum EnumerationSingleton {

    INSTANCE("A", 1);

    private final String name;
    private final Integer value;

    EnumerationSingleton(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public void sayOk() {
        System.out.println("OK~");
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }
}