package com.kgn.employee_service.intf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PROJECT-SERVICE")
public interface EmployeeInterface {
    @GetMapping("/projects/{id}")
    public String getProjectNameById(@PathVariable("id") int id);
}
