package bimo.syahputro.belajar.services;

import bimo.syahputro.belajar.entities.ExperienceEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ExperienceService {
    ExperienceEntity add(ExperienceEntity param);
    ExperienceEntity update(ExperienceEntity param);
    List<ExperienceEntity> getAll();
    ExperienceEntity getById(int id);
    void delete(int id);
}
