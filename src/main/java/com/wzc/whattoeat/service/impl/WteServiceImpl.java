package com.wzc.whattoeat.service.impl;

import com.wzc.whattoeat.dao.intf.DiningHallDishMapper;
import com.wzc.whattoeat.dto.DiningHallDishDto;
import com.wzc.whattoeat.dto.DiningHallDto;
import com.wzc.whattoeat.entity.DiningHallDishEntity;
import com.wzc.whattoeat.service.intf.WteService;
import com.wzc.whattoeat.utils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname WteServiceImpl
 * @Description
 * @Date 2021/4/18 0:18
 * @Created by PrinceCheng
 */
@Service("wteService")
public class WteServiceImpl implements WteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WteServiceImpl.class);

    @Autowired
    DiningHallDishMapper diningHallDishMapper;

    /**
     * 查询所有餐厅
     *
     * @return
     */
    @Override
    public List<DiningHallDto> findAllDiningHall() {
        // 查询entity
        List<DiningHallDishEntity> entityList = diningHallDishMapper.findAllDiningHall();
        if (!CollectionUtils.isEmpty(entityList)) {
            // entity转dto
            return entityList.stream().map(n -> {
                DiningHallDto dto = new DiningHallDto();
                dto.setDiningHallCode(n.getDiningHallCode());
                dto.setDiningHallName(n.getDiningHallName());
                return dto;
            }).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }

    /**
     * 根据餐厅查询菜品
     *
     * @param diningHallCode 餐厅编码
     * @return
     */
    @Override
    public List<DiningHallDishDto> findDishByHall(String diningHallCode) {
        List<DiningHallDishDto> dtoList = new ArrayList<>();
        // 查询entity
        List<DiningHallDishEntity> entityList = diningHallDishMapper.findDishByHall(diningHallCode);
        // entity转dto
        for (DiningHallDishEntity entity : entityList) {
            DiningHallDishDto dto = BeanUtils.copyProperties(entity, DiningHallDishDto.class);
            dtoList.add(dto);
        }
        return dtoList;
    }
}
