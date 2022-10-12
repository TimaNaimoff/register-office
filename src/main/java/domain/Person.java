package domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="ro_person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="sex",discriminatorType = DiscriminatorType.INTEGER)
@NamedQueries({
      @NamedQuery(name="Person.findPersons",
      query="SELECT p FROM Person p LEFT JOIN FETCH  " +
              " p.passports ps " +
              " LEFT JOIN FETCH p.birthSertificate bs " +
              " WHERE p.personId = :personId")
})

public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="person_id")
    private Long personId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="patronymic")
    private String patronymic;
    @Column(name="date_of_birth")
    private LocalDate dateOfBith;
    @OneToOne(cascade ={CascadeType.REFRESH},fetch=FetchType.LAZY,mappedBy = "person")
    private BirthSertificate birthSertificate;
    @OneToMany(cascade={CascadeType.REFRESH},fetch = FetchType.LAZY,mappedBy="person")
    private List<Passport> passports;

    public List<Passport> getPassports() {
        return passports;
    }

    public void setPassports(List<Passport> passports) {
        this.passports = passports;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBith() {
        return dateOfBith;
    }

    public void setDateOfBith(LocalDate dateOfBith) {
        this.dateOfBith = dateOfBith;
    }

    public BirthSertificate getBirthSertificate() {
        return birthSertificate;
    }

    public void setBirthSertificate(BirthSertificate birthSertificate) {
        this.birthSertificate = birthSertificate;
    }
}
