package com.kgn.project_service.service;

import com.kgn.project_service.entity.ProjectEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class ProjectService {

    @Autowired
    RestTemplate restTemplate;
    public List<ProjectEntity> getProjects(){
        log.info("Inside getProjects");
        ProjectEntity projectEntity1 = new ProjectEntity(1,"Kafka SESP",1);
        ProjectEntity projectEntity2 = new ProjectEntity(2,"ProDeploy Enterprise",2);
        ProjectEntity projectEntity3 = new ProjectEntity(3,"F1 CHL",3);
        return Arrays.asList(projectEntity1,projectEntity2,projectEntity3);
    }

    public String getProjectNameById(int projectId){
        log.info("Inside getProjectById");
        int clientId = getProjects().stream().filter(project->project.getProjectId()==projectId).findFirst().get().getClientId();
        String projectName =  getProjects().stream().filter(project->project.getProjectId()==projectId).findFirst().get().getProjectName();
        String clientName = restTemplate.getForObject("http://client-service/clients/"+clientId, String.class);
                return projectName+"-"+clientName;
    }

}
