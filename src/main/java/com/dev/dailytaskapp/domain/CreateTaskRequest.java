package com.dev.dailytaskapp.domain;


import com.dev.dailytaskapp.domain.entity.TaskPriority;

import java.time.LocalDate;

public record CreateTaskRequest(
        String description,
        String title,
        LocalDate dueDate,
        TaskPriority priority
) {
}


