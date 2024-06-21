package demoQA.winer24.drivers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage{

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/span/button")
    public WebElement pressHome;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/span/label/span[1]")
    public WebElement openHome;

   @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[1]/span/button")
   public WebElement desktop;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]")
    public WebElement desktopCommands;

    @FindBy(id = "result")
    public WebElement result;
    public CheckBoxPage fullUpHome (){
        webElementActions.click(pressHome);
        webElementActions.click(openHome);
        return this;
    }
    public CheckBoxPage fullUpDesktop (){
        webElementActions.click(pressHome);
        webElementActions.click(desktop);
        webElementActions.click(desktopCommands);
        return this;
    }




}
