import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest{
   @BeforeClass
   public void set() {
        driver.get("https://demoqa.com/frames");
    }

    @Test(description = "Verify that driver can switch to another frame")
    public void frameSwitch(){

        iframeHelper.switchToFrame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        iframeHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());

    }
}
