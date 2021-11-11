package com.bimo.syahputro.belajar.services;

import com.bimo.syahputro.belajar.entities.SertificateEntity;
import com.bimo.syahputro.belajar.repositories.SertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SertificateServiceImpl implements SertificateService{

    @Autowired
    SertificateRepository sertificateRepository;

    @Override
    public SertificateEntity add(SertificateEntity param) {
        return sertificateRepository.save(param);
    }

    @Override
    public SertificateEntity update(SertificateEntity param) {
        return sertificateRepository.save(param);
    }

    @Override
    public List<SertificateEntity> getAll() {
        return sertificateRepository.findAll();
    }

    @Override
    public SertificateEntity getById(int id) {
        return sertificateRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        sertificateRepository.deleteById(id);
    }
}
