DROP TABLE IF EXISTS ro_person;


CREATE TABLE ro_person(
    person_id SERIAL,
    first_name varchar(100)not null,
    last_name varchar(100)not null,
    patronymic varchar(100)not null,
    date_of_bith date not null,
    PRIMARY KEY(person_id)
);

CREATE TABLE passports(
    passport_id SERIAL,
    person_id integer not null,
    passport_seria varchar(10)not null,
    passport_number varchar(10)not null,
    issue_date date not null,
    issue_department varchar(200)not null,
    PRIMARY KEY(passport_id),
    FOREIGN KEY(person_id)REFERENCES ro_person(person_id)ON DELETE RESTRICT
)