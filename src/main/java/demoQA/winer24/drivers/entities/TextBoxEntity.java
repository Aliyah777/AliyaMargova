package demoQA.winer24.drivers.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class TextBoxEntity {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permamentAddres;


}
