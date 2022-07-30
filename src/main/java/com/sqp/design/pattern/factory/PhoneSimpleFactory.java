package com.sqp.design.pattern.factory;

import com.sqp.design.pattern.entity.*;

/**
 * 简单工厂模式
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
public class PhoneSimpleFactory {

    public static Phone makePhone(String brand) {
        if ("huawei".equals(brand)) {
            return new HuaweiPhone();
        } else if ("mi".equals(brand)) {
            return new MiPhone();
        } else if ("oppo".equals(brand)) {
            return new OppoPhone();
        } else if ("vivo".equals(brand)) {
            return new VivoPhone();
        } else {
            throw new RuntimeException("brand not exist");
        }
    }

    public static void main(String[] args) {
        Phone huawei = PhoneSimpleFactory.makePhone("huawei");
        Phone mi = PhoneSimpleFactory.makePhone("mi");
        Phone oppo = PhoneSimpleFactory.makePhone("oppo");
        Phone vivo = PhoneSimpleFactory.makePhone("vivo");
        System.out.println(huawei.getName());
        System.out.println(mi.getName());
        System.out.println(oppo.getName());
        System.out.println(vivo.getName());
    }

}