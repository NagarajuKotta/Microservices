package com.kgn.employee_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EmployeeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServerApplication.class, args);
    }

}
