package bimo.syahputro.belajar.services;

import bimo.syahputro.belajar.entities.ExperienceEntity;

import java.util.List;

public interface ExperienceService {
    ExperienceEntity add(ExperienceEntity param);
    ExperienceEntity update(ExperienceEntity param);
    List<ExperienceEntity> getAll();
    ExperienceEntity getById(int id);
    void delete(int id);
}
