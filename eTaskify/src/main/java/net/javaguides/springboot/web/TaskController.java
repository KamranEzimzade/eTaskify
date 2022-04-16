package net.javaguides.springboot.web;


import net.javaguides.springboot.model.Task;
import net.javaguides.springboot.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    // handler method to handle list tasks request and return mode and view
    @GetMapping("/tasks")
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "Tasks";
    }

    @RequestMapping("/tasks/new")
    public String createTaskForm(Model model) {

        // create task object to hold task form data
        Task task = new Task();
        model.addAttribute("task", task);
        return "add_task";
    }

    @PostMapping("/tasks")
    public String saveTask(@ModelAttribute("task") Task task) {
        taskService.saveTask(task);
        return "redirect:/tasks";
    }


}
