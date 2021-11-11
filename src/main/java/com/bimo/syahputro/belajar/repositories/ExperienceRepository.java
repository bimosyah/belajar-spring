package com.bimo.syahputro.belajar.repositories;

import com.bimo.syahputro.belajar.entities.ExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<ExperienceEntity, Integer> {
}
