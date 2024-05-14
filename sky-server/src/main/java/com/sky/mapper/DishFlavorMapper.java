package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 李荣楷
 */
@Mapper
public interface DishFlavorMapper {
    /**
     *  批量插入口味数据
     * @author lrk
     * @param flavors
     * @throws
     */
    void insertBatch(List<DishFlavor> flavors);
}
