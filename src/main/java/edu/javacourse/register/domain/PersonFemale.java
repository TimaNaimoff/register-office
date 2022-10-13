package edu.javacourse.register.domain;

import javax.persistence.*;
import java.util.List;

@DiscriminatorValue(value="1")
@Entity
public class PersonFemale extends Person{
    @OneToMany(cascade = {CascadeType.REFRESH},fetch= FetchType.LAZY,
            mappedBy = "wife")

    private List<MarriageSertificate> marriageSertificates;
    @OneToMany(cascade = {CascadeType.REFRESH},fetch= FetchType.LAZY,
            mappedBy = "mother")
    private List<BirthSertificate>bithSertificates;

    public List<MarriageSertificate> getSertificates() {
        return marriageSertificates;
    }

    public void setSertificates(List<MarriageSertificate> marriageSertificates) {
        this.marriageSertificates = marriageSertificates;
    }

    public List<MarriageSertificate> getMarriageSertificates() {
        return marriageSertificates;
    }

    public void setMarriageSertificates(List<MarriageSertificate> marriageSertificates) {
        this.marriageSertificates = marriageSertificates;
    }

    public List<BirthSertificate> getBithSertificates() {
        return bithSertificates;
    }

    public void setBithSertificates(List<BirthSertificate> bithSertificates) {
        this.bithSertificates = bithSertificates;
    }
}
