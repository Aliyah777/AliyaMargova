import demoQA.winer24.drivers.entities.TextBoxEntity;
import demoQA.winer24.drivers.pages.DemoQAPages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

    @Test
    public void textBoxtest () throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        TextBoxEntity textBoxEntity = randomUtils.generateRandomTextBoxEtity();
        demoQAPages.getTextBoxPage().fillUpTextBoxForm(textBoxEntity);
        Thread.sleep(3000);
        Assert.assertTrue(true);
    }



}
