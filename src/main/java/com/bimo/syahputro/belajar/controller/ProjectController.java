package com.bimo.syahputro.belajar.controller;

import com.bimo.syahputro.belajar.entities.ProjectEntity;
import com.bimo.syahputro.belajar.response.CommonResponse;
import com.bimo.syahputro.belajar.response.CommonResponseGenerator;
import com.bimo.syahputro.belajar.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @PostMapping(value = "")
    public CommonResponse<ProjectEntity> add(@RequestBody ProjectEntity param){
        return commonResponseGenerator.successResponse(projectService.add(param),"sukses");
    }

    @PutMapping(value = "")
    public CommonResponse<ProjectEntity> update(@RequestBody ProjectEntity param){
        return commonResponseGenerator.successResponse(projectService.update(param),"sukses");
    }

    @DeleteMapping(value = "/{id}")
    public CommonResponse<String> delete(@PathVariable("id") int id){
        projectService.delete(id);
        return commonResponseGenerator.successResponse(null,"sukses");
    }

    @GetMapping(value = "")
    public CommonResponse<List<ProjectEntity>> getAll(){
        return commonResponseGenerator.successResponse(projectService.getAll(),"sukses");
    }

    @GetMapping(value = "/{id}")
    public CommonResponse<ProjectEntity> getById(@PathVariable("id") int id){
        return commonResponseGenerator.successResponse(projectService.getById(id),"sukses");
    }

}
