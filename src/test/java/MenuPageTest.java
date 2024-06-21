import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MenuPageTest extends BaseTest{

    @Test(description = "Werify move to element methods is working")
    public void moveToElement() throws InterruptedException {
        browserHelper.open("https://demoqa.com/menu");
        webElementActions.moveToElement(demoQAPages.getMenuPage().mainItem2);
        Thread.sleep(2000);

    }
}
