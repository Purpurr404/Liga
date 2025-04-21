package ui;

import base.BaseTest;
import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.demoqa.CheckBoxPage;

public class CheckBoxTest extends BaseTest {


    private CheckBoxPage checkBoxPage;

    @BeforeClass
    public void setup(){
        checkBoxPage = new CheckBoxPage(driver);
    }

    @Test(description = "Перейти на страницу")
    public void step_01(){
        checkBoxPage.openCheckBoxPage();
        Assert.assertEquals(checkBoxPage.getPageName(), "Check Box");
    }

    @Test
    public void step_02(){
        checkBoxPage.openListCheckBox("Home");
        checkBoxPage.setCheckBox("Desktop", true);
        Assert.assertTrue(checkBoxPage.getCheckBoxState("Desktop"));
    }

}
