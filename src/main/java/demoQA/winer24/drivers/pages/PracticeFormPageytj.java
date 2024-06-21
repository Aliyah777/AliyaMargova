package demoQA.winer24.drivers.pages;

import demoQA.winer24.drivers.entities.PracticeFormEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPageytj extends BasePage {
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "userEmail")
    public WebElement userEmail;
    @FindBy(id = "userNumber")
    public WebElement userNumber;
    @FindBy(xpath = "//label[text()='Male']")
    private WebElement genderMaleInput;

    @FindBy(xpath = "//label[text()='Female']")
    private WebElement genderFemaleInput;

    @FindBy(xpath = "//label[text()='Other']")
    private WebElement genderOtherInput;
//    @FindBy(id = "subjectsContainer")
//    public WebElement subjects;
    @FindBy(css = "#subjectsInput")
    public WebElement subjInput;
  @FindBy(id = "hobbies-checkbox-1")
    public WebElement hobbiesSport;
  @FindBy(id = "hobbies-checkbox-2")
    public WebElement hobbiesReading;
  @FindBy(id = "hobbies-checkbox-3")
    public WebElement hobbiesMusic;
    @FindBy(css = "#uploadPicture")
    public WebElement pictureInput;
  @FindBy(id = "currentAddress")
    public WebElement currentAddress;
 @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[2]/div/div/div[1]")
    public WebElement selectState;
  @FindBy(xpath = "//*[@id=\"city\"]//div[contains(@class,'css-1hwfws3')]")
    public WebElement selectCity;

@FindBy(id = "submit")
    public WebElement submitBtn;

//public PracticeFormPageytj fillUpPracticeForm(PracticeFormEntity practiceFormEntity){
//   webElementActions.sendKeys(firstName, practiceFormEntity.getFirstName())
//           .sendKeys(lastName, practiceFormEntity.getLastName())
//           .sendKeys(userEmail, practiceFormEntity.getEmail())
//           .click(genderFemaleInput)
//           .sendKeys(userNumber, practiceFormEntity.getUserNumber())
//           .sendKeysWithEnter(subjInput, practiceFormEntity.getSubject())
//           .click(hobbiesSport)
////           .click(hobbiesReading)
////           .click(hobbiesMusic)
////           .sendKeys(pictureInput, practiceFormEntity.getPicture())
//           .sendKeys(currentAddress, practiceFormEntity.getCurrentAddress())
//           .moveToElement(selectState)
//           .sendKeysWithEnter(selectState, practiceFormEntity.getSelectState())
////           .sendKeysWithEnter(selectCity,practiceFormEntity.getSelectCity())
//           .click(submitBtn);
//   return this;
//
//}


}
