import demoQA.winer24.drivers.helper.WebElementActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest{
//    @Test( description = "Check button is working correct")   // это просто проверка нажатия кнопки
//    public void progressBarTestBtn() throws InterruptedException {
//        browserHelper.open("https://demoqa.com/progress-bar");
//        webElementActions.click(demoQAPages.getProgressBarPage().startStopBtn);
//        Thread.sleep(2000);
//        webElementActions.click(demoQAPages.getProgressBarPage().startStopBtn);
//        System.out.println(demoQAPages.getProgressBarPage().areaValueNow.getAttribute("ariaValueNow"));
//
//    }
    @Test(description = "Check stop on needed % Value")
    public void progressBarTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/progress-bar");
        webElementActions.click(demoQAPages.getProgressBarPage().startStopBtn);

        String valueNow; // Создаем переменную для хранения текущего значения aria-valuenow
        while (true) { // Начало бесконечного цикла, пока не прервется с помощью break
            valueNow = demoQAPages.getProgressBarPage().areaValueNow.getAttribute("aria-valuenow"); // Извлечение текущего значения aria-valuenow
            if (valueNow.equals("52")) { // Проверка
                webElementActions.click(demoQAPages.getProgressBarPage().startStopBtn); // Остановка процесса в связи с выполнением условия выше
                break;
            }
        }

        Assert.assertEquals(valueNow, "52"); // Сравнение полученного значения с ожидаемым

    }

}
