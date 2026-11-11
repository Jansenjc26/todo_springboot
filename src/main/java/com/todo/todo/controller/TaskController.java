package com.todo.todo.controller;

import com.todo.todo.model.Task;
import com.todo.todo.service.TaskService;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController                       //Makes this class handle REST API requests.
@RequestMapping("/api/tasks")         //Defines the base URL.


public class TaskController {
    private final TaskService taskService;
    
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    // Endpoint to add a new task

    @PostMapping                                       // Maps HTTP POST requests to this method. 
    public Task addTask(@RequestBody Task task){
        return taskService.addTask(task);              // Calls the service to add the task and returns the saved task.   
    }

    @GetMapping                                        // Maps HTTP GET requests to this method.
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();   
    }

    @GetMapping ("/{id}")
    public Task getTask(@PathVariable long id){
        return taskService.getTask(id);
    }

    @PutMapping ("/{id}")
    public Task updateTask(@PathVariable long id, @RequestBody Task updatedTask){
        return taskService.updateTask(id, updatedTask);
    }

    @DeleteMapping ("/{id}")
    public Task deleteTask(@PathVariable long id){
        return taskService.deleteTask(id);
    }
}
