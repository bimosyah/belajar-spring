package com.bimo.syahputro.belajar.repositories;

import com.bimo.syahputro.belajar.entities.SertificateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SertificateRepository extends JpaRepository<SertificateEntity, Integer> {
}
