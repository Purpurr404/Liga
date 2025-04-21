package ui;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.webform.WebFormPage;

public class WebFormTest extends BaseTest {

    private WebFormPage webFormPage;

    @BeforeClass
    public void beforeClass() {
        webFormPage = new WebFormPage(driver);
    }

    @Test
    public void step_01() {
        webFormPage.openWebFormPage();
    }

    @Test
    public void step_02() {
    WebElement userNameInput = driver.findElement(By.xpath("//input[@name='my-text']"));
    userNameInput.sendKeys("Полуяхтова Варвара Тимофеевна");
    }

    @Test
    public void step_03(){
        WebElement textareaInput = driver.findElement(By.xpath("//textarea[@name='my-textarea']"));
        textareaInput.sendKeys("Лига Цифровой Экономики");
    }

    @Test
    public void step_04(){
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='my-password']"));
        passwordInput.sendKeys("Password");
    }

    @Test
    public void step_05() {
        WebElement dropdownSelect = driver.findElement(By.xpath("//select[@class='form-select']"));
        dropdownSelect.click();
        WebElement value2 = driver.findElement(By.xpath("//select[@class='form-select']//option[@value='2']"));
        value2.click();
    }

    @Test
    public void step_06() {
        WebElement dropdownDatalist = driver.findElement(By.xpath("//input[@name='my-datalist']"));
        dropdownDatalist.sendKeys("Seattle");
    }

    @Test
    public void step_07() {
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@name='my-check'])[2]"));
        checkBox2.click();
    }

}
