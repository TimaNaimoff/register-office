package view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageResponse implements Serializable{
     private String husbandSurName;
     private String husbandGivenName;
     private String husbanPatronymic;
     private LocalDate husbandDateOfBith;
     private String husbandPassportSeria;
     private String husbandPassportNumber;
     private LocalDate husbandPassportIssueDate;

     private String wifeSurName;
     private String wifeGivenName;
     private String wifePatronymic;
     private LocalDate wifeDateOfBith;
     private String wifePassportSeria;
     private String wifePassportNumber;
     private LocalDate wifePassportIssueDate;

     private String marriageCertificateNumber;
     private LocalDate marriageCertificateDate;
}
