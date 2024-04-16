package com.zee.service;

import com.zee.dto.ProjectDTO;
import com.zee.service.CrudService;

public interface ProjectService extends CrudService<ProjectDTO,String> {

    void complete(ProjectDTO project);
}
