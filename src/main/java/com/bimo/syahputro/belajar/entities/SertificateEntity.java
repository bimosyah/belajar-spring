package com.bimo.syahputro.belajar.entities;

import javax.persistence.*;

@Entity
@Table(name = "sertificate")
public class SertificateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String organitation;
    private String ExpirationDate;
    private String CredentialId;
    private String CredentialUrl;

    public SertificateEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganitation() {
        return organitation;
    }

    public void setOrganitation(String organitation) {
        this.organitation = organitation;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getCredentialId() {
        return CredentialId;
    }

    public void setCredentialId(String credentialId) {
        CredentialId = credentialId;
    }

    public String getCredentialUrl() {
        return CredentialUrl;
    }

    public void setCredentialUrl(String credentialUrl) {
        CredentialUrl = credentialUrl;
    }

    @Override
    public String toString() {
        return "SertificateEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", organitation='" + organitation + '\'' +
                ", ExpirationDate='" + ExpirationDate + '\'' +
                ", CredentialId='" + CredentialId + '\'' +
                ", CredentialUrl='" + CredentialUrl + '\'' +
                '}';
    }
}


// id             int NOT NULL AUTO_INCREMENT,
//         name           varchar(100),
//         organitation   varchar(100),
//         expirationDate date,
//         credentialId   varchar(200),
//         credentialUrl  text,