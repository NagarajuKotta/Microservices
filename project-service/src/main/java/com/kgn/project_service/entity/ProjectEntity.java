package com.kgn.project_service.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class ProjectEntity {

    private int projectId;
    private String projectName;
    private int clientId;
}
