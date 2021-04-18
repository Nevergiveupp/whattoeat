package com.wzc.whattoeat.service.intf;

import com.wzc.whattoeat.dto.DiningHallDishDto;
import com.wzc.whattoeat.dto.DiningHallDto;

import java.util.List;

/**
 * @Classname WteService
 * @Description 主页服务
 * @Date 2021/4/18 0:18
 * @Created by PrinceCheng
 */
public interface WteService {
    /**
     * 查询所有餐厅
     *
     * @return 餐厅列表
     */
    List<DiningHallDto> findAllDiningHall();

    /**
     * 根据餐厅查询菜品
     *
     * @param diningHallCode 餐厅编码
     * @return
     */
    List<DiningHallDishDto> findDishByHall(String diningHallCode);
}
