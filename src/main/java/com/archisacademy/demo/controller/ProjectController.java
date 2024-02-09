package com.archisacademy.demo.controller;

import com.archisacademy.demo.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/getall")
    public List<String> getAllProjects(){
        return projectService.getAll();
    }

    @PostMapping("/add")
    public String create(@RequestBody String projectName){
        return projectService.addProject(projectName);
    }

    @DeleteMapping("/delete/{index}")
    public String delete(@PathVariable int index){
        return projectService.delete(index);
    }

    @PatchMapping("/update/{index}")
    public String update(@PathVariable int index, @RequestBody String newProjectName) {
        return projectService.update(index,newProjectName);
    }


}
