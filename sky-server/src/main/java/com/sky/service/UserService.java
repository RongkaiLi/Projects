package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @author 李荣楷
 */
public interface UserService {

    /**
     *  微信登录
     * @author lrk
     * @param userLoginDTO
     * @return {@link com.sky.entity.User}
     * @throws 
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
