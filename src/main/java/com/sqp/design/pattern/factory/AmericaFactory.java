package com.sqp.design.pattern.factory;

import com.sqp.design.pattern.entity.IPhone;
import com.sqp.design.pattern.entity.Phone;

import java.util.Collections;
import java.util.List;

/**
 * 工厂方法模式
 *
 * @author shanqingpeng
 * @date 2022/07/30
 */
public class AmericaFactory implements PhoneFactory {

    @Override
    public List<Phone> makePhones() {
        return Collections.singletonList(new IPhone());
    }

}
