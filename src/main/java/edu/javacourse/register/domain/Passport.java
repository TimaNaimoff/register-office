package edu.javacourse.register.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="passports")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="passport_id")
    private Long passportId;
    @ManyToOne(cascade = {CascadeType.REFRESH},fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;
    @Column(name="passport_seria")
    private String passportSeria;
    @Column(name="passport_number")
    private String passportNumber;
    @Column(name="issue_date")
    private LocalDate issueDate;
    @Column(name="issue_department")
    private String issueDepartment;

    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }


    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
