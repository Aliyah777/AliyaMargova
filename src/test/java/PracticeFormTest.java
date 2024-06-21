import demoQA.winer24.drivers.entities.PracticeFormEntity;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {

    @Test
    public void practiceFormTest() {
        driver.get("https://demoqa.com/automation-practice-form");
        PracticeFormEntity practiceFormEntity = randomUtils.generateRandomPracticeForme();
        demoQAPages.getPracticeForm().fillPracticeForm(practiceFormEntity);
    }

}