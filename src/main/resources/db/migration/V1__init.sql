CREATE TABLE experience
(
    id             int NOT NULL AUTO_INCREMENT,
    title          varchar(100),
    employmentType varchar(100),
    companyName    varchar(100),
    location       varchar(100),
    startDate      date,
    endDate        date,
    industry       varchar(100),
    description    text,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE education
(
    id          int NOT NULL AUTO_INCREMENT,
    name        varchar(100),
    degree      varchar(100),
    major       varchar(100),
    startDate   date,
    endDate     date,
    description text,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE sertificate
(
    id             int NOT NULL AUTO_INCREMENT,
    name           varchar(100),
    organitation   varchar(100),
    expirationDate date,
    credentialId   varchar(200),
    credentialUrl  text,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE project
(
    id          int NOT NULL AUTO_INCREMENT,
    name        varchar(100),
    startDate   date,
    endDate     date,
    projectUrl  text,
    description text,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE projectDetail
(
    id        int NOT NULL AUTO_INCREMENT,
    idProject int,
    imageUrl  text,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

