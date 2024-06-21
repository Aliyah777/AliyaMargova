import demoQA.winer24.drivers.pages.CheckBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    void testBox (){
        driver.get("https://demoqa.com/checkbox");
        demoQAPages.getCheckBoxPage().fullUpDesktop();
        String result = demoQAPages.getCheckBoxPage().result.getText();
        Assert.assertEquals(result,"You have selected :\n" +
                "commands");}
//        demoQAPages.getCheckBoxPage().fullUpHome();
//        String result = checkBox.result.getText();
//        Assert.assertEquals(result, "You have selected :\n" +
//                "home\n" +
//                "desktop\n" +
//                "notes\n" +
//                "commands\n" +
//                "documents\n" +
//                "workspace\n" +
//                "react\n" +
//                "angular\n" +
//                "veu\n" +
//                "office\n" +
//                "public\n" +
//                "private\n" +
//                "classified\n" +
//                "general\n" +
//                "downloads\n" +
//                "wordFile\n" +
//                "excelFile");
//
//    }

}

