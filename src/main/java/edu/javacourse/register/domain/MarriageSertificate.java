package edu.javacourse.register.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name="ro_marriage_certificate")
@Entity
@NamedQueries({
        @NamedQuery(name="MarriageSertificate.findMarriageCertificate",query="SELECT mr FROM MarriageSertificate mr INNER JOIN " +
                " mr.husband mrh INNER JOIN mr.wife WHERE certificate_status=:certificate_status")

})
public class MarriageSertificate {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="marriage_id")
    private Long marriageCertificateId;
    @Column(name="mr_certificate_number")
    private String number;
    @Column(name="mr_issue_date")
    private LocalDate issueDate;
    @ManyToOne(cascade={CascadeType.REFRESH},fetch=FetchType.LAZY)
    @JoinColumn(name="husband_id")
    private PersonMale husband;
    @ManyToOne(cascade={CascadeType.REFRESH},fetch=FetchType.LAZY)
    @JoinColumn(name="wife_id")
    private PersonFemale wife;
    @Column(name="certificate_status")
    private boolean active;
    @Column(name="end_date")
    private LocalDate endDate;

    public Long getMarriageCertificateId() {
        return marriageCertificateId;
    }

    public void setMarriageCertificateId(Long marriageCertificateId) {
        this.marriageCertificateId = marriageCertificateId;
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

    public PersonMale getHusband() {
        return husband;
    }

    public void setHusband(PersonMale husband) {
        this.husband = husband;
    }

    public PersonFemale getWife() {
        return wife;
    }

    public void setWife(PersonFemale wife) {
        this.wife = wife;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
