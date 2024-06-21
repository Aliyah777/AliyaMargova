package demoQA.winer24.drivers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgressBarPage extends BasePage{
    @FindBy (id = "startStopButton")
    public WebElement startStopBtn;
    @FindBy(id = "progressBar")
    public WebElement progressBar;
    @FindBy(xpath = "//div[@aria-valuenow]")
    public WebElement areaValueNow;

}
