package com.dev.dailytaskapp.service;

import com.dev.dailytaskapp.domain.CreateTaskRequest;
import com.dev.dailytaskapp.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);
}
