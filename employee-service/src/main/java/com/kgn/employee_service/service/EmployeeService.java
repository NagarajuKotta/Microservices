package com.kgn.employee_service.service;

import com.kgn.employee_service.dao.EmployeeDAO;
import com.kgn.employee_service.entity.EmployeeEntity;
import com.kgn.employee_service.intf.EmployeeInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    EmployeeInterface employeeInterface;
    @Autowired
    EmployeeDAO employeeDAO;
    public List<EmployeeEntity> getEmployees(){
        log.info("Inside getEmployees");
       return employeeDAO.getEmployees();
    }

    public Optional<EmployeeEntity> getEmployeeById(int empId){
        log.info("Inside getEmployeeById");
        Optional<EmployeeEntity> employeeEntity = employeeDAO.getEmployeeById(empId);
        String projectName = employeeInterface.getProjectNameById(employeeEntity.get().getProjectId());
        employeeEntity.get().setProjectName(projectName);
        return employeeEntity;
    }

    public int insertEmployee(EmployeeEntity emp){
        return employeeDAO.insertEmployee(emp);
    }
}
