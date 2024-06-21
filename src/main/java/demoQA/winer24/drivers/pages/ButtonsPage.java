package demoQA.winer24.drivers.pages;

import demoQA.winer24.drivers.drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage{
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;
    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessage;
    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement jastClickBtn;

    @FindBy(id = "dynamicClickMessage")
    public WebElement actClickMessage;

//    public final String doubleClickMessage = DriverManager.getDriver().findElement(By.id("doubleClickMessage")).getText();

}
