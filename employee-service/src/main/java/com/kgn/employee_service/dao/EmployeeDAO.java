package com.kgn.employee_service.dao;


import com.kgn.employee_service.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDAO {
    public List<EmployeeEntity> getEmployees(){
        EmployeeEntity employee1 = new EmployeeEntity(1,"naga",1,null);
        EmployeeEntity employee2 = new EmployeeEntity(2,"satwik",3,null);
        EmployeeEntity employee3 = new EmployeeEntity(3,"nivi",1,null);
        EmployeeEntity employee4 = new EmployeeEntity(5,"lakshmi",2,null);
        EmployeeEntity employee5 = new EmployeeEntity(4,"naga",1,null);
        EmployeeEntity employee6 = new EmployeeEntity(6,"sushma",3,null);

        return Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6);
    }

    public Optional<EmployeeEntity> getEmployeeById(int empId){
        List<EmployeeEntity> empList = getEmployees();
        return empList.stream().filter(emp->emp.getEmpId()==empId).findFirst();
    }

    public int insertEmployee(EmployeeEntity emp){
        List<EmployeeEntity> empList = getEmployees();
        empList.add(emp);
        return emp.getEmpId();
    }
}
