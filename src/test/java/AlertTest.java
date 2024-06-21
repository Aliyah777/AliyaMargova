import demoQA.winer24.drivers.utils.ConfigReader;

import org.testng.annotations.Test;

import static demoQA.winer24.drivers.enums.Endpoints.ALERTS;

public class AlertTest extends BaseTest {


    @Test
    void alertTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL") + ALERTS.getEndpoint());
        webElementActions.click(demoQAPages.getAlertPage().cofirmButton);
        webElementActions.pause(5000);
        alertHelper.acceptAlert();
        webElementActions.pause(5000);
    }


}
