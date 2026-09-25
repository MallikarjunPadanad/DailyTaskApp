package com.dev.dailytaskapp.service.impl;

import com.dev.dailytaskapp.domain.CreateTaskRequest;
import com.dev.dailytaskapp.domain.entity.Task;
import com.dev.dailytaskapp.domain.entity.TaskPriority;
import com.dev.dailytaskapp.domain.entity.TaskStatus;
import com.dev.dailytaskapp.repository.TaskRepository;
import com.dev.dailytaskapp.service.TaskService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();
        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now

        );
        return taskRepository.save(task);
    }

    @Override
    public List<Task> listTasks() {
        return taskRepository.findAll(Sort.by(Sort.Direction.ASC, "created"));
    }
}
