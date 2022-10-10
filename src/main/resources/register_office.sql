DROP TABLE IF EXISTS person;


CREATE TABLE person(
    person_id SERIAL,
    first_name varchar(100)not null,
    last_name varchar(100)not null,
    PRIMARY KEY(person_id)
)