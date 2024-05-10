package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    void save(EmployeeDTO employeeDTO);

    /**
     *  分页查询
     * @author lrk
     * @param employeePageQueryDTO 
     * @return {@link PageResult}
     * @throws 
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     *  启用禁用员工账号
     * @author lrk
     * @param status
     * @param id
     * @throws 
     */
    void startOrStop(Integer status, long id);

    /**
     *  根据id查询员工信息
     * @author lrk
     * @param id
     * @return {@link com.sky.entity.Employee}
     * @throws
     */
    Employee getById(long id);

    /**
     *  编辑员工信息
     * @author lrk
     * @param employeeDTO
     * @throws
     */
    void update(EmployeeDTO employeeDTO);
}
