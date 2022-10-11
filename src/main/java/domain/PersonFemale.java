package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@DiscriminatorValue(value="1")
@Entity
public class PersonFemale extends Person{

//    private List<MarriageSertificate> marriageSertificates;
//    private List<BithSertificate>bithSertificates;
//
//    public List<MarriageSertificate> getSertificates() {
//        return marriageSertificates;
//    }
//
//    public void setSertificates(List<MarriageSertificate> marriageSertificates) {
//        this.marriageSertificates = marriageSertificates;
//    }
//
//    public List<MarriageSertificate> getMarriageSertificates() {
//        return marriageSertificates;
//    }
//
//    public void setMarriageSertificates(List<MarriageSertificate> marriageSertificates) {
//        this.marriageSertificates = marriageSertificates;
//    }
//
//    public List<BithSertificate> getBithSertificates() {
//        return bithSertificates;
//    }
//
//    public void setBithSertificates(List<BithSertificate> bithSertificates) {
//        this.bithSertificates = bithSertificates;
//    }
}
