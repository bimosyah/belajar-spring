package com.bimo.syahputro.belajar.services;

import com.bimo.syahputro.belajar.entities.EducationEntity;
import com.bimo.syahputro.belajar.entities.SertificateEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SertificateService {
    SertificateEntity add(SertificateEntity param);
    SertificateEntity update(SertificateEntity param);
    List<SertificateEntity> getAll();
    SertificateEntity getById(int id);
    void delete(int id);
}
