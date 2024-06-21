package demoQA.winer24.drivers.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHelperSelect {
    public WebDriver driver;
    public DropDownHelperSelect(WebDriver driver) {
        this.driver = driver;
    }

    public DropDownHelperSelect() {

    }

    public DropDownHelperSelect selectByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
        return this;
    }

    public DropDownHelperSelect selectByValueText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
        return this;

    }

    public DropDownHelperSelect selectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
        return this;

    }

    // Вывод всех элементов выпадающего списка через ЦИКЛ
    public DropDownHelperSelect getOptions(WebElement element) {
        Select select = new Select(element);
        List<WebElement> listOfOptions = select.getOptions();
        for (WebElement item : listOfOptions) {
            System.out.println(item.getText());
        }
        return this;
    }

    // Вывод всех элементов выпадающего списка через СТРИМ
    public DropDownHelperSelect getOptions2(WebElement element) {
        Select select = new Select(element);
        select.getOptions().stream()
                .map(WebElement::getText)
                .forEach(System.out::println);
        return this;
    }

    // Вывод всех выбранных элементов выпадающего списка через цикл
    public DropDownHelperSelect getAllSelectedOptions(WebElement element) {
        Select select = new Select(element);
        List<WebElement> listOfAllSelectedOptions = select.getAllSelectedOptions();
        for (WebElement item : listOfAllSelectedOptions) {
            System.out.println(item.getText());
        }
        return this;
    }



}
