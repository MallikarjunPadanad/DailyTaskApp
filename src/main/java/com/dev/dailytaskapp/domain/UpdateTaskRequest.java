package com.dev.dailytaskapp.domain;

import com.dev.dailytaskapp.domain.entity.TaskPriority;
import com.dev.dailytaskapp.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
