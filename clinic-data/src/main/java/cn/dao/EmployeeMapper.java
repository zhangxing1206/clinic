package cn.dao;

import cn.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    public List<Employee> employeeInfo(@Param("eSection") int eSection);
}
