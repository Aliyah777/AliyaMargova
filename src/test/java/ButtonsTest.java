import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

@Test(description = "Verify double click button is working property")
    public void doubleClickTest(){
    driver.get("https://demoqa.com/buttons");
    webElementActions.doubleClick(demoQAPages.getButtonsPage().doubleClickBtn);
    Assert.assertEquals(demoQAPages.getButtonsPage().doubleClickMessage.getText(),"You have done a double click");
}

    @Test(description = "Verify right click button is working property")
    public void rightClickTest() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(4000);
        webElementActions.rightClick(demoQAPages.getButtonsPage().rightClickBtn);
        Assert.assertEquals(demoQAPages.getButtonsPage().rightClickMessage.getText(),"You have done a right click");

    }
    @Test(description = "Verify click button is working property")
    public void actClickTest() throws InterruptedException {
   browserHelper.open("https://demoqa.com/buttons");
   Thread.sleep(3000);
    webElementActions.click(demoQAPages.getButtonsPage().jastClickBtn);
    Assert.assertEquals(demoQAPages.getButtonsPage().actClickMessage.getText(), "You have done a dynamic click");
    }

}
