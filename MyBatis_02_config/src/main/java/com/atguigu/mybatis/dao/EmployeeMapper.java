package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Employee;

/**
 * Created with IntelliJ IDEA.
 * To change it use File | Settings | Editor | File and Code Templates.
 *
 * @author Peter
 * @date 2021/11/3 15:47
 * @description TODO
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);
}
