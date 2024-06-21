package demoQA.winer24.drivers.pages;

import demoQA.winer24.drivers.drivers.DriverManager;
import demoQA.winer24.drivers.helper.DropDownHelperSelect;
import demoQA.winer24.drivers.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

// protected WebDriver driver;
// protected DriverManager driverManager;
//
//     driver = DriverManager.getDriver();

         public BasePage(){
            PageFactory.initElements(DriverManager.getDriver(),this);
        }

        public WebElementActions webElementActions = new WebElementActions();
        public DropDownHelperSelect dropDownHelper = new DropDownHelperSelect(DriverManager.getDriver());

    }
