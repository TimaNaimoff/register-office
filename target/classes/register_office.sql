DROP TABLE IF EXISTS ro_birth_certificate;
DROP TABLE IF EXISTS passports;
DROP TABLE IF EXISTS ro_marriage_certificate;
DROP TABLE IF EXISTS ro_person;


CREATE TABLE ro_person(
    person_id SERIAL,
    sex smallint not null,
    first_name varchar(100)not null,
    last_name varchar(100)not null,
    patronymic varchar(100)not null,
    date_of_birth date not null,
    PRIMARY KEY(person_id)
);
INSERT INTO ro_person(sex,first_name,last_name,patronymic,date_of_birth)VALUES
(1,'Kimaria','Selengard','Cherrow','1999-06-25'),(2,'Argines','Mappickar','Lodan','1978-04-04'),
(2,'Madris','Treikar','Erlackon','1999-09-19');

CREATE TABLE passports(
    passport_id SERIAL,
    person_id integer not null,
    passport_seria varchar(10)not null,
    passport_number varchar(10)not null,
    issue_date date not null,
    issue_department varchar(200)not null,
    PRIMARY KEY(passport_id),
    FOREIGN KEY(person_id)REFERENCES ro_person(person_id)ON DELETE RESTRICT
);

INSERT INTO passports(person_id,passport_seria,passport_number,issue_date,issue_department)VALUES
(1,'44444','654321','2018-04-11','Department Passport');

CREATE TABLE ro_birth_certificate(
    birth_certificate_id SERIAL,
    number_certificate varchar(10)not null,
    issue_date date not null,
    person_id integer not null,
    father_id integer,
    mother_id integer,
    PRIMARY KEY(birth_certificate_id),
    FOREIGN KEY (person_id) REFERENCES ro_person(person_id)ON DELETE RESTRICT,
    FOREIGN KEY (father_id) REFERENCES ro_person(person_id)ON DELETE RESTRICT,
    FOREIGN KEY (mother_id) REFERENCES ro_person(person_id)ON DELETE RESTRICT
);
INSERT INTO ro_birth_certificate_id(number_certificate,issue_date,person_id,father_id,mother_id)
VALUES('123 Tupan','2019-10-20',3,1,2);

CREATE TABLE ro_marriage_certificate(
    marriage_id SERIAL,
    mr_certificate_number varchar(10)not null,
    mr_issue_date date not null,
    husband_id integer not null,
    wife_id integer not null,
    certificate_status boolean DEFAULT false,
    end_date date not null,
    PRIMARY KEY(marriage_id),
    FOREIGN KEY (husband_id)REFERENCES ro_person(person_id)ON DELETE RESTRICT,
    FOREIGN KEY(wife_id)REFERENCES ro_person(person_id)ON DELETE RESTRICT

);

INSERT INTO ro_marriage_certificate(mr_certificate_number,mr_issue_date,husband_id,wife_id,certificate_status,end_date)
VALUES(1,'2020-09-10',2,1,true,'2024-12-12');