package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     *  插入员工数据
     * @author lrk
     * @throws
     */
    @Insert("insert into employee (name,username,password,phone,sex,id_number,create_time,update_time,create_user,update_user,status)" +
            "values (#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{createTime},#{updateTime},#{createUser},#{updateUser},#{status})")
    void insert(Employee employee);

    /**
     *  分页查询
     * @author lrk
     * @param employeePageQueryDTO
     * @return {@link com.github.pagehelper.Page<com.sky.entity.Employee>}
     * @throws 
     */
    //动态sql使用动态标签，不使用注解，将sql写到映射配置文件中
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     *  根据主键动态修改属性
     * @author lrk
     * @param employee
     * @throws
     */
    void update(Employee employee);
}
