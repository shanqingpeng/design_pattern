package com.sqp.design.pattern.factory;

import com.sqp.design.pattern.entity.*;

import java.util.List;

/**
 * 工厂方法模式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class PhoneFactoryMethod {

    public static void main(String[] args) {
        System.out.print("中国手机: ");
        ChinaPhoneFactory chinaPhoneFactory = new ChinaPhoneFactory();
        List<Phone> chinaPhones = chinaPhoneFactory.makePhones();
        chinaPhones.forEach((phone) -> System.out.print(phone.getName() + "\t"));
        System.out.println();

        System.out.print("美国手机: ");
        AmericaFactory americaFactory = new AmericaFactory();
        List<Phone> americaPhones = americaFactory.makePhones();
        americaPhones.forEach((phone -> System.out.print(phone.getName() + "\t")));
        System.out.println();
    }

}