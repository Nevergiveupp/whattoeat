package com.wzc.whattoeat.dao.intf;

import com.wzc.whattoeat.entity.DiningHallDishEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author PrinceCheng
 * @date 2021/4/18
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository
public interface DiningHallDishMapper {

    /**
     * 查询所有餐厅
     *
     * @return 餐厅列表
     */
    List<DiningHallDishEntity> findAllDiningHall();

    /**
     * 根据餐厅查询菜品
     *
     * @param diningHallCode 餐厅编码
     * @return
     */
    List<DiningHallDishEntity> findDishByHall(String diningHallCode);
}
