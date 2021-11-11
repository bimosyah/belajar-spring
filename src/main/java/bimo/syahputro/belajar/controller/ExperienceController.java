package bimo.syahputro.belajar.controller;

import bimo.syahputro.belajar.entities.ExperienceEntity;
import bimo.syahputro.belajar.response.CommonResponse;
import bimo.syahputro.belajar.response.CommonResponseGenerator;
import bimo.syahputro.belajar.services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
public class ExperienceController {

    @Autowired
    ExperienceService experienceService;

    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @PostMapping(value = "experience")
    public CommonResponse<ExperienceEntity> add(@RequestBody ExperienceEntity param){
        return commonResponseGenerator.successResponse(experienceService.add(param),"sukses");
    }

    @PutMapping(value = "experience")
    public CommonResponse<ExperienceEntity> update(@RequestBody ExperienceEntity param){
        return commonResponseGenerator.successResponse(experienceService.update(param),"sukses");
    }

    @GetMapping(value = "experience")
    public CommonResponse<List<ExperienceEntity>> getAll(){
        return commonResponseGenerator.successResponse(experienceService.getAll(),"sukses");
    }

    @GetMapping(value = "experience/{id}")
    public CommonResponse<ExperienceEntity> getBydId(@PathVariable("id") int id){
        return commonResponseGenerator.successResponse(experienceService.getById(id),"sukses");
    }
}
