package com.bimo.syahputro.belajar.services;

import com.bimo.syahputro.belajar.entities.ProjectEntity;
import com.bimo.syahputro.belajar.entities.SertificateEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProjectService {
    ProjectEntity add(ProjectEntity param);
    ProjectEntity update(ProjectEntity param);
    List<ProjectEntity> getAll();
    ProjectEntity getById(int id);
    void delete(int id);
}
