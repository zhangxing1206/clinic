package cn.service;

import cn.dao.EmployeeMapper;
import cn.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> employeeInfo(int eSection){
        return employeeMapper.employeeInfo(eSection);
    }

}
