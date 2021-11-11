package com.bimo.syahputro.belajar.services;

import com.bimo.syahputro.belajar.entities.ProjectEntity;
import com.bimo.syahputro.belajar.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public ProjectEntity add(ProjectEntity param) {
        return projectRepository.save(param);
    }

    @Override
    public ProjectEntity update(ProjectEntity param) {
        return projectRepository.save(param);
    }

    @Override
    public List<ProjectEntity> getAll() {
        return projectRepository.findAll();
    }

    @Override
    public ProjectEntity getById(int id) {
        return projectRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        projectRepository.deleteById(id);
    }
}
