package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    Task saveTask(Task task);

}
