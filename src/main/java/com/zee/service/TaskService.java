package com.zee.service;

import com.zee.dto.TaskDTO;
import com.zee.dto.UserDTO;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO,Long> {

   List<TaskDTO> findTasksByManager(UserDTO manager);
}
