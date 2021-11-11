package com.bimo.syahputro.belajar.controller;

import com.bimo.syahputro.belajar.entities.EducationEntity;
import com.bimo.syahputro.belajar.response.CommonResponse;
import com.bimo.syahputro.belajar.response.CommonResponseGenerator;
import com.bimo.syahputro.belajar.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/education")
public class EducationController {
    @Autowired
    EducationService educationService;

    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @PostMapping()
    public CommonResponse<EducationEntity> add(@RequestBody EducationEntity param){
        return commonResponseGenerator.successResponse(educationService.add(param),"sukses");
    }

    @GetMapping()
    public CommonResponse<List<EducationEntity>> getAll(){
        return commonResponseGenerator.successResponse(educationService.getAll(),"sukses");
    }

    @GetMapping("/{id}")
    public CommonResponse<EducationEntity> getByid(@PathVariable("id") int id){
        return commonResponseGenerator.successResponse(educationService.getById(id),"sukses");
    }

    @PutMapping()
    public CommonResponse<EducationEntity> update(@RequestBody EducationEntity param){
        return commonResponseGenerator.successResponse(educationService.add(param),"sukses");
    }

    @DeleteMapping("/{id}")
    public CommonResponse<String> delete(@PathVariable("id") int id){
        educationService.delete(id);
        return commonResponseGenerator.successResponse(null,"sukses");
    }
}
