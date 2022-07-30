package com.sqp.design.pattern.factory;

import com.sqp.design.pattern.entity.Phone;

import java.util.List;

/**
 * @author shanqingpeng
 * @date 2022/07/29
 */
public interface PhoneFactory {

    List<Phone> makePhones();

}
