package com.kgn.project_service.controller;

import com.kgn.project_service.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/{id}")
    public String getProjectNameById(@PathVariable("id") int id){

        return projectService.getProjectNameById(id);
    }
}
