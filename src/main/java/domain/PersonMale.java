package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue(value="2")
public class PersonMale extends Person{
    @OneToMany(cascade = {CascadeType.REFRESH},fetch= FetchType.LAZY,
            mappedBy = "husband")

    private List<MarriageSertificate> marriageSertificates;
    @OneToMany(cascade = {CascadeType.REFRESH},fetch= FetchType.LAZY,
            mappedBy = "father")
    private List<BirthSertificate>birthSertificates;

    public List<MarriageSertificate> getMarriageSertificates() {
        return marriageSertificates;
    }

    public void setMarriageSertificates(List<MarriageSertificate> marriageSertificates) {
        this.marriageSertificates = marriageSertificates;
    }

    public List<BirthSertificate> getBithSertificates() {
        return birthSertificates;
    }

    public void setBithSertificates(List<BirthSertificate> birthSertificates) {
        this.birthSertificates = birthSertificates;
    }
}
