package com.zee.service;

import com.zee.dto.TaskDTO;
import com.zee.dto.UserDTO;
import com.zee.enums.Status;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO,Long> {

   List<TaskDTO> findTasksByManager(UserDTO manager);

   List<TaskDTO> findAllTasksByStatusIsNot(Status status);

   List<TaskDTO> findAllTasksByStatus(Status status);

   void updateStatus(TaskDTO task);


}
