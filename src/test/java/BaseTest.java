import demoQA.winer24.drivers.drivers.DriverManager;
import demoQA.winer24.drivers.helper.*;
import demoQA.winer24.drivers.pages.*;
import demoQA.winer24.drivers.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected RandomUtils randomUtils;
    protected WebElementActions webElementActions;
    protected DemoQAPages demoQAPages;
    protected AlertHelper alertHelper;
    protected BrowserHelper browserHelper;
    protected DropDownHelperSelect dropDownHelperSelect;
    protected IframeHelper iframeHelper;
    


    @BeforeClass(alwaysRun = true)
    public  void setUp (){
        driver = DriverManager.getDriver();
        randomUtils = new RandomUtils();
        demoQAPages = new DemoQAPages();
        demoQAPages.setUp();
        browserHelper = new BrowserHelper(driver);
        webElementActions = new WebElementActions();
        alertHelper =new AlertHelper(driver);
        dropDownHelperSelect= new DropDownHelperSelect();
        iframeHelper =new IframeHelper(driver);


    }
//
//    @AfterClass(alwaysRun = true)
//    public void tearDown(){
//        DriverManager.closeDriver();
//    }

  @BeforeClass(alwaysRun = true)
    public void setUp3() {
        driver = DriverManager.getDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverManager.closeDriver();
    }
}
