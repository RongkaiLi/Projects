package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @author 李荣楷
 */
public interface DishService {
    /**
     *  新增菜品和对应的口味
     * @author lrk
     * @param dishDTO
     * @throws 
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
