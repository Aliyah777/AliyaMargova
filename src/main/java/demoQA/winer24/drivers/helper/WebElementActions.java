package demoQA.winer24.drivers.helper;

import demoQA.winer24.drivers.drivers.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WebElementActions {
//    создали объект класса Actions и хотим исподьзовать его методы, такие как дабл клик.
//    @BeforeClass(alwaysRun = true)
//    public void init(){
//        actions = new Actions(DriverManager.getDriver());
//    }
    public Actions actions = new Actions(DriverManager.getDriver());
          // метод кликает
    @Step ("Performing step")
        public WebElementActions click(WebElement element){
            waitElementToBeClickAble(element);
            scrollToElement(element);
            element.click();
            return this;
        }


        // заполняет элемент
        public WebElementActions sendKeys(WebElement element, String txt) {
            waitElementToBeVisible(element);
            scrollToElement(element);
            element.sendKeys(txt); //с element передаем в txt
            return this;
        }
        // заполняет элемент и нажимает Enter
        public WebElementActions sendKeysWithEnter(WebElement element, String txt) {
            waitElementToBeVisible(element);
            scrollToElement(element);
            element.sendKeys(txt); //с element передаем в txt
            element.sendKeys(Keys.ENTER);//в sendKeys передаем клавиатуру и дальше выбираем какую кнопку хотим нажать
            return this;
        }

    // Метод для добавления задержки
    public void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        // ждет пока элемент не станет кликабельным
        public WebElementActions waitElementToBeClickAble(WebElement element){
            new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(30))
                    .until(ExpectedConditions.elementToBeClickable(element));
            return this;
        }
        // ждет пока элемент не станет видимым
        public WebElementActions waitElementToBeVisible(WebElement element){
            new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
                    .until(ExpectedConditions.visibilityOf(element));
            return this;
        }

    public WebElementActions jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].click();", element);
        return this;
    }

    public WebElementActions highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].style.outline='3px solid red'", element);
        return this;
    }

    public WebElementActions jsSendKeys(WebElement element, String txt) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].value = arguments[1];", element);
        return this;
    }

    public WebElementActions scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;

    }

    public WebElementActions doubleClick(WebElement element) {
        scrollToElement(element);
        waitElementToBeVisible(element);
        waitElementToBeClickAble(element);
        actions.doubleClick(element).perform();
        return this;
    }
    public WebElementActions rightClick(WebElement element){
        scrollToElement(element);
        waitElementToBeVisible(element);
        waitElementToBeClickAble(element);
        actions.contextClick(element).perform();
        return this;

    }
    public WebElementActions actClick (WebElement element){
        scrollToElement(element);
        waitElementToBeVisible(element);
        waitElementToBeClickAble(element);
        actions.click(element).perform();
        return this;
    }

    public WebElementActions moveToElement (WebElement element){
        waitElementToBeClickAble(element);
        actions.moveToElement(element).perform();
        return this;
    }



    // метод находит все элементы по указанному xPath, ложит их в лист
    // рандомно выбирает один из элементов
    public WebElement randomElementSelection(String xPath){
        List<WebElement> list = DriverManager.getDriver().findElements(By.xpath(xPath));
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Элемент не найден");
        }
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }
    // метод находит все элементы по указанному xPath, ложит их в лист
    // рандомно выбирает один или несколько элементов, и кликает на них
    public void clickRandomElements(String xpath) {
        List<WebElement> list = DriverManager.getDriver().findElements(By.xpath(xpath));
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Элементы не найдены");
        }
        Random random = new Random();
        int index1 = random.nextInt(list.size()) + 1; // Добавляем 1, чтобы index1 был как минимум 1
        List<WebElement> randomElements = new ArrayList<>();
        for (int i = 0; i < index1; i++) {
            int index = random.nextInt(list.size());
            randomElements.add(list.get(index));
            list.remove(index); // Удаляем выбранный элемент из списка, чтобы не выбрать его снова
        }
        for (WebElement element : randomElements) {
            jsClick(element);
        }
    }

    // метод находит элемент по указанному xPath, кликая на него раскрывает всплывающий список
    // по указанному xPath ложит весь всплывающий список в лист
    // рандомно выбирает один из элементов
    public String randomElementSelection(String xpathDropdownControl, String xpathDropdownItems){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        // Нахождение контроллера списка и открытие списка
        WebElement dropdownControl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathDropdownControl)));
        dropdownControl.click();
        // Явное ожидание появления элементов списка
        List<WebElement> dropdownItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathDropdownItems)));
        // Создание списка для хранения текстов элементов
        ArrayList<String> itemList = new ArrayList<>();
        // Добавление всех текстов элементов в ArrayList
        for (WebElement item : dropdownItems) {
            itemList.add(item.getText());
        }
        Random random = new Random();
        int index = random.nextInt(itemList.size());
        return itemList.get(index);
    }
    // МЕТОД необходимый для редактирования данных
    public WebElementActions clearAndSendKeys(WebElement element, String txt) {
        waitElementToBeVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(txt);
        return this;
    }
    public void pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
public WebElement waitForElementToBEvisibleByFluentWait (By locator, int timeoutInSeconds, int pollingInSeconds){
    Wait <WebDriver> wait = new FluentWait<>(DriverManager.getDriver())
            .withTimeout(Duration.ofSeconds(25))
            .pollingEvery(Duration.ofSeconds(5))
            //В течении 20 сек, каждые 5 сек проверяет, как найдет элеменит, то тогда не дажидается до конца первых 20 сек.
            .ignoring(NoSuchElementException.class);
    WebElement element = wait.until(new Function<WebDriver, WebElement>() {
        @Override
        public WebElement apply(WebDriver driver) {
            WebElement element = driver.findElement(locator);
            if (element.isDisplayed()) {
                return element;
            } else {
            return null;
        }
            }

    });
    return element;
}

}
