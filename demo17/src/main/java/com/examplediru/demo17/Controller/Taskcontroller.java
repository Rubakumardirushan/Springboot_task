package com.examplediru.demo17.Controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.examplediru.demo17.model.Task;
import com.examplediru.demo17.Repositary.TaskRepositary;

@RestController
@CrossOrigin
public class Taskcontroller {
    @Autowired
    private TaskRepositary taskRepositary;

    @GetMapping("path")
    public String getMethodName() {
        return "Hello World";
    }

    @PostMapping("api/task")
    public Task Posttask(@RequestBody Task task) {
        taskRepositary.save(task);
        System.out.println(task);
        return task;
    }

    @GetMapping("api/task")
    public List<Task> getTasks() {
        return taskRepositary.findAll();
    }

}
