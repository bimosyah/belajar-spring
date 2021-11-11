package com.bimo.syahputro.belajar.services;

import com.bimo.syahputro.belajar.entities.ExperienceEntity;
import com.bimo.syahputro.belajar.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    ExperienceRepository experienceRepository;

    @Override
    public ExperienceEntity add(ExperienceEntity param) {
        return experienceRepository.save(param);
    }

    @Override
    public ExperienceEntity update(ExperienceEntity param) {
        return experienceRepository.save(param);
    }

    @Override
    public List<ExperienceEntity> getAll() {
        return experienceRepository.findAll();
    }

    @Override
    public ExperienceEntity getById(int id) {
        return experienceRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        experienceRepository.deleteById(id);
    }
}
