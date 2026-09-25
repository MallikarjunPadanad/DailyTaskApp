package com.dev.dailytaskapp.domain.dto;

import com.dev.dailytaskapp.domain.entity.TaskPriority;
import com.dev.dailytaskapp.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
