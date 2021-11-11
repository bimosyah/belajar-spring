package com.bimo.syahputro.belajar.services;

import com.bimo.syahputro.belajar.entities.EducationEntity;
import com.bimo.syahputro.belajar.repositories.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService{

    @Autowired
    EducationRepository educationRepository;

    @Override
    public EducationEntity add(EducationEntity param) {
        return educationRepository.save(param);
    }

    @Override
    public EducationEntity update(EducationEntity param) {
        return educationRepository.save(param);
    }

    @Override
    public List<EducationEntity> getAll() {
        return educationRepository.findAll();
    }

    @Override
    public EducationEntity getById(int id) {
        return educationRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        educationRepository.deleteById(id);
    }
}
