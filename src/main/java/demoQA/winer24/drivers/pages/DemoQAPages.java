package demoQA.winer24.drivers.pages;

import demoQA.winer24.drivers.helper.BrowserHelper;
import demoQA.winer24.drivers.helper.DropDownHelperSelect;
import lombok.*;
import org.testng.annotations.BeforeClass;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemoQAPages {


    protected AlertPage alertPage;
    protected ButtonsPage buttonsPage;
    protected CheckBoxPage checkBoxPage;
    protected MenuPage menuPage;
    protected PracticeFormPage practiceForm;
    protected ProgressBarPage progressBarPage;
    protected TextBoxPage textBoxPage;
    protected BrowserHelper browserHelper;
    protected EmployeeWebTablesPage employeeWebTablesPage;
    protected SelectMenuPage selectMenuPage;


    @BeforeClass(alwaysRun = true)
    public  void setUp (){

        alertPage = new AlertPage();
        practiceForm = new PracticeFormPage();
        textBoxPage = new TextBoxPage();
        buttonsPage = new ButtonsPage();
        menuPage =new MenuPage();
        progressBarPage=new ProgressBarPage();
        employeeWebTablesPage=new EmployeeWebTablesPage();
        selectMenuPage=new SelectMenuPage();




    }


}
