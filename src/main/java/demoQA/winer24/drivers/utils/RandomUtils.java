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
        practiceFormEntity.setPicture("C:\\Users\\Алия\\IdeaProjects\\DemoQAWinter2024\\src\\main\\resources\\pictures\\123.jpg");
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
