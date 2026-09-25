package com.dev.dailytaskapp.mapper;

import com.dev.dailytaskapp.domain.CreateTaskRequest;
import com.dev.dailytaskapp.domain.dto.TaskDto;
import com.dev.dailytaskapp.domain.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequest dto);

    TaskDto toDto(Task task);
}
