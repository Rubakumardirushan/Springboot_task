package com.examplediru.demo17;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Taskcontroller {
    @GetMapping("/getTask")
    public String getTask() {
        return "Get Task";
    }

    @PostMapping("path")
    public List<String> posttask() {
        List<String> list = new ArrayList<>();
        list.add("Task 1");
        list.add("Task 2");
        list.add("Task 3");
        return list;
    }

}
