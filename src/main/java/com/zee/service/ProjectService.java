package com.zee.service;

import com.zee.dto.ProjectDTO;
import com.zee.dto.UserDTO;
import com.zee.service.CrudService;

import java.util.List;

public interface ProjectService extends CrudService<ProjectDTO,String> {

    void complete(ProjectDTO project);
    List<ProjectDTO> getCountedListOfProjectDTO(UserDTO manager);
}
