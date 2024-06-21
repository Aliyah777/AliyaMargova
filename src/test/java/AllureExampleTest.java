import demoQA.winer24.drivers.enums.Endpoints;
import demoQA.winer24.drivers.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

import static demoQA.winer24.drivers.enums.Endpoints.ALERTS;

public class AllureExampleTest extends BaseTest {

    //то пример как разделить на группы, все эти тесты

    @Test(groups = {"Smoke", "UI", "1721"}, description = "Alert test")
    // All Allure annotations
    @Description(" Check check ")   //нужно выбрать (io.qameta.allure)
    @Owner("Aliyah")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)  // на сколько серьезен баг
    @Story("GCPINT-8877")
    @Epic("Registration")
    @Link("google.com")
        // @Step("Annotation for method to see in Allure")

    void alertTest () throws InterruptedException {
       browserHelper.open(ConfigReader.getValue("baseURL")+ ALERTS.getEndpoint());
        webElementActions.click(demoQAPages.getAlertPage().cofirmButton);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        Thread.sleep(30000);
    }

    @Test (groups = {"Regression", "API", "1721"}, description = "Alert test1")
    void alertTest1 () throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().cofirmButton);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        Thread.sleep(30000);
    }

    @Test (groups = {"2E2", "SQL", "1721"}, description = "Alert test2")
    void alertTest2 () throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().cofirmButton);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        Thread.sleep(30000);
    }
}
