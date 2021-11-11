package com.bimo.syahputro.belajar.controller;

import com.bimo.syahputro.belajar.entities.SertificateEntity;
import com.bimo.syahputro.belajar.response.CommonResponse;
import com.bimo.syahputro.belajar.response.CommonResponseGenerator;
import com.bimo.syahputro.belajar.services.SertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/sertificate")
public class SertificateController {
    @Autowired
    SertificateService sertificateService;
    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @PostMapping(value = "")
    public CommonResponse<SertificateEntity> add(@RequestBody SertificateEntity param){
        return commonResponseGenerator.successResponse(sertificateService.add(param),"sukses");
    }

    @PutMapping(value = "")
    public CommonResponse<SertificateEntity> update(@RequestBody SertificateEntity param){
        return commonResponseGenerator.successResponse(sertificateService.update(param),"sukses");
    }

    @DeleteMapping(value = "/{id}")
    public CommonResponse<String> delete(@PathVariable("id") int id){
        sertificateService.delete(id);
        return commonResponseGenerator.successResponse(null,"sukses");
    }

    @GetMapping(value = "")
    public CommonResponse<List<SertificateEntity>> getAll(){
        return commonResponseGenerator.successResponse(sertificateService.getAll(),"sukses");
    }

    @GetMapping(value = "/{id}")
    public CommonResponse<SertificateEntity> getById(@PathVariable("id") int id){
        return commonResponseGenerator.successResponse(sertificateService.getById(id),"sukses");
    }
}
