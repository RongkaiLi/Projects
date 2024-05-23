package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 李荣楷
 */
@Mapper
public interface UserMapper {

    /**
     * 根据openid查询用户
     * @author lrk
     * @param openid
     * @return {@link User}
     * @throws
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     *  插入数据
     * @author lrk
     * @param user
     * @throws
     */
    void insert(User user);
}
