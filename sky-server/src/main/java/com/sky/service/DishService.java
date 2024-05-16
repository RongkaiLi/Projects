package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

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

    /**
     *  菜品分页查询
     * @author lrk
     * @param dishPageQueryDTO
     * @return {@link com.sky.result.PageResult}
     * @throws
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     *  菜品批量删除
     * @author lrk
     * @param ids
     * @throws
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品和对应的口味数据
     * @author lrk
     * @param id
     * @return {@link DishVO}
     * @throws
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 根据id修改菜品基本信息和对应的口味信息
     * @author lrk
     * @param dishDTO
     * @throws
     */
    void updateWithFlavor(DishDTO dishDTO);
}
