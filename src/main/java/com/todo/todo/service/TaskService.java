package com.todo.todo.service;

import com.todo.todo.model.Task;
import com.todo.todo.repository.TaskRepository;

import org.springframework.stereotype.Service; 
import java.util.List;


@Service                                                                  // Indicates that this class is a service component in the Spring context.
public class TaskService {

    private final TaskRepository taskRepository;
    
    public TaskService(TaskRepository taskRepository){                   // constructor injection
        this.taskRepository=taskRepository;
    }
       

    public Task addTask(Task task){
        return taskRepository.save(task);                               // save the task to the database
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();                               // retrieve all tasks from the database
    }

    public Task getTask(Long id){
        return taskRepository.findById(id).orElse(null);        // retrieve a task by its ID, or return null if not found
    }

    public Task updateTask(Long id, Task updatedTask){
        Task existingTask = taskRepository.findById(id).orElse(null);
         if (existingTask!=null){
            existingTask.setTitle(updatedTask.getTitle());
            existingTask.setDescription(updatedTask.getDescription());
            existingTask.setCompleted(updatedTask.isCompleted());
            return taskRepository.save(existingTask); 
         }
         else
        {
         return null; 
         }
        
    }

    public Task deleteTask(long id){
        taskRepository.deleteById(id);
        return null;
    }


}
