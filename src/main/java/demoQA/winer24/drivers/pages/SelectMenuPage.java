package demoQA.winer24.drivers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuPage extends BasePage{
    // Элементы Select Value:
    @FindBy(xpath = "//div[text()='Select Option']")
    public WebElement selectOptionClick;

    @FindBy(xpath = "//div[text()='Group 1, option 1']")
    public WebElement group1Option1Click;

    @FindBy(xpath = "//div[text()='Group 1, option 2']")
    public WebElement group1Option2Click;

    @FindBy(xpath = "//div[text()='Group 2, option 1']")
    public WebElement group2Option1Click;

    @FindBy(xpath = "//div[text()='Group 2, option 2']")
    public WebElement group2Opttion2Click;

    // Элементы Select One:
    @FindBy(xpath = "//div[text()='Select Title']")
    public WebElement selectTitleClick;

    @FindBy(xpath = "//div[text()='Dr.']")
    public WebElement drClick;

    @FindBy(xpath = "//div[text()='Mr.']")
    public WebElement mrClick;

    @FindBy(xpath = "//div[text()='Mrs.']")
    public WebElement mrsClick;

    @FindBy(xpath = "//div[text()='Ms.']")
    public WebElement msClick;

    // Элементы Old Style Select Menu:
    @FindBy(id = "oldSelectMenu")
    public WebElement selectMenuClick;

    // Элементы Multiselect drop down:
    @FindBy(xpath = "//div[text()='Select...']")
    public WebElement multiselectDropDownClick;

    @FindBy(xpath = "//div[text()='Green']")
    public WebElement greenClick;

    @FindBy(xpath = "//div[text()='Blue']")
    public WebElement blueClick;

    @FindBy(xpath = "//div[text()='Black']")
    public WebElement blackClick;

    @FindBy(xpath = "//div[text()='Red']")
    public WebElement redClick;

    // Элементы Standard multi select:
    @FindBy(id = "cars")
    public WebElement standardMultiSelectClick;

    public SelectMenuPage fillUpSelectMenuPage() {
        webElementActions.click(selectOptionClick)
                .click(group1Option1Click)
                .click(selectTitleClick)
                .click(mrsClick);
        String selectedOption = group1Option1Click.getText();
        String selectedTitle = mrsClick.getText();
        dropDownHelper.selectByIndex(selectMenuClick, 3);
//        dropdownHelper.getOptions(selectMenuClick);
        webElementActions.click(multiselectDropDownClick)
                .click(blueClick)
                .click(greenClick)
                .click(redClick);
        String selectedDownClicks = blueClick.getText() + ", " + greenClick.getText() + ", " + redClick.getText();
        dropDownHelper.selectByValueText(standardMultiSelectClick, "volvo");

        System.out.println("Результаты заполнения Select Menu\nПоле  Select Value:   " + selectedOption +
                "\nПоле Select One:  " + selectedTitle +
                "\nПоле Old Style Select Menu:   " + getSelectedOption(selectMenuClick) +
                "\nПоле Multiselect drop down:   " + selectedDownClicks +
                "\nПоле Standard multi select:   " + getSelectedOption(standardMultiSelectClick));


        return this;
    }

    // Метод для получения выбранного значения из select
    public String getSelectedOption(WebElement element) {
        Select select = new Select(element);
        return select.getFirstSelectedOption().getText();

    }


}
