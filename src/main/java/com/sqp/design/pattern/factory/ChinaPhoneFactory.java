package com.sqp.design.pattern.factory;

import com.sqp.design.pattern.entity.*;

import java.util.Arrays;
import java.util.List;

/**
 * 工厂方法模式
 *
 * @author shanqingpeng
 * @date 2022/07/30
 */
public class ChinaPhoneFactory implements PhoneFactory {

    @Override
    public List<Phone> makePhones() {
        return Arrays.asList(
                new HuaweiPhone(),
                new MiPhone(),
                new OppoPhone(),
                new VivoPhone()
        );
    }

}
