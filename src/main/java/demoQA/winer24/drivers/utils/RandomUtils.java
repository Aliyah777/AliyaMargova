package demoQA.winer24.drivers.utils;

import com.github.javafaker.Faker;
import demoQA.winer24.drivers.entities.EmployeeEntity;
import demoQA.winer24.drivers.entities.PracticeFormEntity;
import demoQA.winer24.drivers.entities.TextBoxEntity;

public class RandomUtils {
    Faker faker = new Faker();

    public TextBoxEntity generateRandomTextBoxEtity(){
        TextBoxEntity textBoxEntity = new TextBoxEntity();
        textBoxEntity.setFullName(faker.name().fullName());
        textBoxEntity.setEmail(faker.internet().emailAddress());
        textBoxEntity.setCurrentAddress(faker.address().fullAddress());
        textBoxEntity.setPermamentAddres(faker.address().secondaryAddress());
        return textBoxEntity;

    }

    public PracticeFormEntity generateRandomPracticeForme(){
        PracticeFormEntity practiceFormEntity = new PracticeFormEntity();
        practiceFormEntity.setFirstName(faker.name().firstName());
        practiceFormEntity.setLastName(faker.name().lastName());
        practiceFormEntity.setUserEmail(faker.internet().emailAddress());
        practiceFormEntity.setUserNumber(faker.phoneNumber().subscriberNumber(10));

        practiceFormEntity.setMonthOfBirth("March");
        practiceFormEntity.setYearOfBirth("2024");
        practiceFormEntity.setSubject("Math");
        practiceFormEntity.setSelectState("Uttar");
        practiceFormEntity.setSelectCity("Agra");
        practiceFormEntity.setPicture("https://upload.wikimedia.org/wikipedia/ru/3/3f/%D0%93%D1%83%D0%B1%D0%BA%D0%B0_%D0%91%D0%BE%D0%B1_%D0%BF%D0%B5%D1%80%D1%81%D0%BE%D0%BD%D0%B0%D0%B6.png?20130704193321");
        practiceFormEntity.setCurrentAddress(faker.address().fullAddress());
        return practiceFormEntity;
    }

    public EmployeeEntity createMockEmployee(){
        EmployeeEntity employee = new EmployeeEntity();
        employee.setFirstName(faker.name().firstName());
        employee.setLastName(faker.name().lastName());
        employee.setAge(faker.number().numberBetween(18,100));
        employee.setEmail(faker.internet().emailAddress());
        employee.setSalary(faker.number().numberBetween(10000000l,200000000000l));
        employee.setDepartment(faker.job().position());

        return employee;



    }
}
