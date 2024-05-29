package com.kgn.employee_service.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EmployeeEntity {

    private int empId;
    private String empName;
    private int projectId;
    private String projectName;
}
