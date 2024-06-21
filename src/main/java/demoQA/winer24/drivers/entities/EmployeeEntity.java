package demoQA.winer24.drivers.entities;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class EmployeeEntity {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private long salary;
    private String department;


}
