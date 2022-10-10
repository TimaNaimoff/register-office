package edu.javacourse.register.domain;



import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
      @Id
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      @Column(name="person_id")
      private Long person_id;
      @Column(name="first_name")
      private String firstName;
      @Column(name="last_name")
      private String lastName;

    public Long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
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

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
