package demoQA.winer24.drivers.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class OperaWebDriver {
    public static WebDriver loadOperaDriver (){
        WebDriverManager.operadriver().setup();
        WebDriver driver = (WebDriver) new OperaWebDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));
        return driver;
    }
}
