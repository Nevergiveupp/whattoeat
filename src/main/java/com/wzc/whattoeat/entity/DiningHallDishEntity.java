package com.wzc.whattoeat.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname DiningHallDishEntity
 * @Description
 * @Date 2021/4/18 0:20
 * @Created by PrinceCheng
 */
@Data
public class DiningHallDishEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -1754770961516906928L;
    /**
     * 主键id
     */
    private int id;
    /**
     * 餐厅编码
     */
    private String diningHallCode;
    /**
     * 餐厅名称
     */
    private String diningHallName;
    /**
     * 菜品编码
     */
    private String dishCode;
    /**
     * 菜品名称
     */
    private String dishName;

}
