package demoQA.winer24.drivers.pages;

import demoQA.winer24.drivers.entities.TextBoxEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
;

public class TextBoxPage extends BasePage {

    @FindBy(id = "userName")
    public WebElement fullNameInput;
    @FindBy(id = "userEmail")
    public WebElement emailInput;
    @FindBy(id = "currentAddress")
    public WebElement currentAddresslInput;
    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;
    @FindBy(id = "submit")
    public WebElement sabmitBtn;




//    public TextBoxPage fillUpTextBoxForm(String fullname, String email, String permanentAddress, String currentAddress) {
//        webElementActions.sendKeys(fullNameInput, fullname)
//                .sendKeys(emailInput, email)
//                .sendKeys(currentAddresslInput, currentAddress)
//                .click(sabmitBtn);
//        return this;
//    }
    public TextBoxPage fillUpTextBoxForm(TextBoxEntity textBoxEntity){
        webElementActions.sendKeys(fullNameInput, textBoxEntity.getFullName())
                .jsSendKeys(emailInput, textBoxEntity.getEmail())
                .sendKeys(currentAddresslInput, textBoxEntity.getCurrentAddress())
                .sendKeys(permanentAddressInput, textBoxEntity.getPermamentAddres())
                .click(sabmitBtn);
        return this;
    }


}
