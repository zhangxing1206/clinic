package cn.service;

import cn.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeService {

    public List<Employee> employeeInfo(@Param("eSection") int eSection);

}
