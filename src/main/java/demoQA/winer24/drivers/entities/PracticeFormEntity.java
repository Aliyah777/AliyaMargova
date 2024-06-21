package demoQA.winer24.drivers.entities;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PracticeFormEntity {
    private String firstName;
    private String lastName;
    private String userEmail;
    private String userNumber;
    private String subject;
    private String currentAddress;
    private String picture;
    private String selectState;
    private String selectCity;
    private String dateOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;


}
