package com.bimo.syahputro.belajar.services;

import com.bimo.syahputro.belajar.entities.EducationEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EducationService {
    EducationEntity add(EducationEntity param);
    EducationEntity update(EducationEntity param);
    List<EducationEntity> getAll();
    EducationEntity getById(int id);
    void delete(int id);
}
