DROP TABLE IF EXISTS passports;
DROP TABLE IF EXISTS ro_person;


CREATE TABLE ro_person(
    person_id SERIAL,
    sex smallint not null,
    first_name varchar(100)not null,
    last_name varchar(100)not null,
    patronymic varchar(100)not null,
    date_of_bith date not null,
    PRIMARY KEY(person_id)
);
INSERT INTO ro_person(sex,first_name,last_name,patronymic,date_of_bithe)VALUES
(1,'Kimaria','Selengard','Cherrow','1999-06-25'),(2,'Argines','Mappickar','Lodan','1978-04-04');

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