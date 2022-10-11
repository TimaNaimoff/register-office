package domain;

import java.time.LocalDate;

public class BithSertificate {
    private Long bithCertificateId;
    private String number;
    private LocalDate issueDate;
    private Person person;
    private PersonMale father;
    private PersonFemale mother;

    public Long getBithCertificateId() {
        return bithCertificateId;
    }

    public void setBithCertificateId(Long bithCertificateId) {
        this.bithCertificateId = bithCertificateId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonMale getFather() {
        return father;
    }

    public void setFather(PersonMale father) {
        this.father = father;
    }

    public PersonFemale getMother() {
        return mother;
    }

    public void setMother(PersonFemale mother) {
        this.mother = mother;
    }
}
