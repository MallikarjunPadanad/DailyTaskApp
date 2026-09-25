package com.dev.dailytaskapp.mapper;

import com.dev.dailytaskapp.domain.CreateTaskRequest;
import com.dev.dailytaskapp.domain.UpdateTaskRequest;
import com.dev.dailytaskapp.domain.dto.CreateTaskRequestDto;
import com.dev.dailytaskapp.domain.dto.TaskDto;
import com.dev.dailytaskapp.domain.dto.UpdateTaskRequestDto;
import com.dev.dailytaskapp.domain.entity.Task;
import jakarta.validation.Valid;

public interface TaskMapper {
    CreateTaskRequest fromDto(@Valid CreateTaskRequestDto dto);

    TaskDto toDto(Task task);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);
}
