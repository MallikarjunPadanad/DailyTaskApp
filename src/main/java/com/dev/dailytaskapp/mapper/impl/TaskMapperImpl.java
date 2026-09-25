package com.dev.dailytaskapp.mapper.impl;

import com.dev.dailytaskapp.domain.CreateTaskRequest;
import com.dev.dailytaskapp.domain.dto.CreateTaskRequestDto;
import com.dev.dailytaskapp.domain.dto.TaskDto;
import com.dev.dailytaskapp.domain.entity.Task;
import com.dev.dailytaskapp.mapper.TaskMapper;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(@Valid CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()

        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
