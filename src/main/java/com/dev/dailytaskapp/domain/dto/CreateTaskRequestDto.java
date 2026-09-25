package com.dev.dailytaskapp.domain.dto;


import com.dev.dailytaskapp.domain.entity.TaskPriority;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.EAN;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record CreateTaskRequestDto(
        @NotBlank(message = ERROR_MESSAGE_TITLE_LENGTH)
        @Length(max = 255, message = ERROR_MESSAGE_TITLE_LENGTH)
        String title,

        @Length(max = 1000,message = ERROR_MESSAGE_DESCRIPTION_LENGTH)
        @Nullable
        String description,

        @Nullable
        @FutureOrPresent(message =ERROR_MESSAGE_DUE_DATE_FUTURE )
        LocalDate dueDate,

        @NotNull(message = ERROR_MESSAGE_PRIORITY)

        TaskPriority priority
) {
    private static final String ERROR_MESSAGE_TITLE_LENGTH = "TITLE must be between 1 and 255 characters";
    private static final String ERROR_MESSAGE_DESCRIPTION_LENGTH = "DESCRIPTION must be between 1 and 1000 characters";
    private static final String ERROR_MESSAGE_DUE_DATE_FUTURE = "DUE DATE must be in the future";
    private static final String ERROR_MESSAGE_PRIORITY = "PRIORITY must be between 1 and 1000 characters";
}
