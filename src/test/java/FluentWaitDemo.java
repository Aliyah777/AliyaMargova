import com.google.common.base.Function;
import demoQA.winer24.drivers.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;


public class FluentWaitDemo {
    public static void main(String[] args) {

        FluentWait<WebDriver> fluentWait = new FluentWait(DriverManager.getDriver());
        fluentWait.withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                //В течении 20 сек, каждые 5 сек проверяет, как найдет элеменит, то тогда не дажидается до конца первых 20 сек.
                .ignoring(NoSuchElementException.class);

        WebElement element = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("someId"));
            }
        });

        element.click();

    }


}
