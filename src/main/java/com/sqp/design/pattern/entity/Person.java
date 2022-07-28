package com.sqp.design.pattern.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Person类
 *
 * @author shanqingpeng
 * @date 2022/07/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    private static final long serialVersionUID = -3500644660191590135L;

    private Integer id;

    private String name;

    private Integer age;

    private Integer gender;

}
