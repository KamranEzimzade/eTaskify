package net.javaguides.springboot;

import net.javaguides.springboot.model.Task;
import net.javaguides.springboot.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistrationLoginSpringBootSecurityThymeleafApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationLoginSpringBootSecurityThymeleafApplication.class, args);
    }


    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {

        Task task1 = new Task("Design Works", "UI of Kitchen Website", "16.04.2022", "assigned");
        taskRepository.save(task1);

        Task task2 = new Task("Construction Works", "Retain Wall compaction", "16.05.2022", "delay");
        taskRepository.save(task2);


    }


}
