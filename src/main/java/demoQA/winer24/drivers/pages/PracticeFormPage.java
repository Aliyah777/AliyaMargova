package demoQA.winer24.drivers.pages;

import demoQA.winer24.drivers.entities.PracticeFormEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class PracticeFormPage extends BasePage {

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(xpath = "(//div[@class = 'custom-control custom-radio custom-control-inline'])[1]")
    public WebElement radio1;

    @FindBy(xpath = "(//div[@class = 'custom-control custom-radio custom-control-inline'])[2]")
    public WebElement radio2;

    @FindBy(xpath = "(//div[@class = 'custom-control custom-radio custom-control-inline'])[3]")
    public WebElement radio3;

    @FindBy(id = "userNumber")
    public WebElement mobileNumberInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "//*[@class=\"react-datepicker__month-select\"]")
    public WebElement monthOfBirthInput;

    @FindBy(id = "//*[@class=\"react-datepicker__year-select\"]")
    public WebElement yearOfBirthInput;
    @FindBy(id = "hobbies-checkbox-1")
    public WebElement sportsHobbyClick;

    @FindBy(id = "hobbies-checkbox-2")
    public WebElement readingHobbyClick;

    @FindBy(id = "hobbies-checkbox-3")
    public WebElement musicHobbyClick;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsContainerInput;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "react-select-3-input")
    public WebElement stateInput;

    @FindBy(id = "react-select-4-input")
    public WebElement cityInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    public PracticeFormPage fillPracticeForm(PracticeFormEntity practiceFormEntity) {
        webElementActions.sendKeys(firstNameInput, practiceFormEntity.getFirstName())
                .sendKeys(lastNameInput, practiceFormEntity.getLastName())
                .sendKeys(emailInput, practiceFormEntity.getUserEmail())
                .jsClick(webElementActions.randomElementSelection("//input[@name ='gender']"))
                .sendKeys(mobileNumberInput, practiceFormEntity.getUserNumber())
                .sendKeysWithEnter(subjectsContainerInput, practiceFormEntity.getSubject())
//                .jsClick(randomHobbiesClick()) // с простым кликом не происходил переход после предыдущего метода
//          .sendKeys(uploadPicture, practiceFormEntity.getPicture())
                .sendKeys(currentAddressInput, practiceFormEntity.getCurrentAddress())
                .sendKeysWithEnter(stateInput, webElementActions.randomElementSelection("(//div[@class=' css-1hwfws3'])[1]", "//div[contains(@class,'menu')]//div[contains(@class,'option')]"))
                .sendKeysWithEnter(cityInput, webElementActions.randomElementSelection("(//div[@class=' css-1hwfws3'])[2]", "//div[contains(@class,'menu')]//div[contains(@class,'option')]"))
                .click(submitBtn);
        return this;
    }
    private final Random random = new Random();
    private String selectedState; // Сохраняет выбранный штат
    // Создаем метод для рандомного выбора хобби
//    private WebElement randomHobbiesClick() {
//        int hobby = random.nextInt(3); // 0, 1, или 2
//        return switch (hobby) {
//            case 0 -> sportsHobbyClick;
//            case 1 -> readingHobbyClick;
//            default -> musicHobbyClick;
//        }
//    }
}

