package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioButtonTest {
        public WebDriver driver;

        @BeforeClass
        public void setup(){
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();

        }

        @AfterClass
        public void tearDown(){
            driver.quit();
        }

        @Test
        public void step_01(){
            driver.get("https://demoqa.com/radio-button");

            WebElement yesRadio = driver.findElement(By.xpath("//label [@for='yesRadio']"));
            yesRadio.click();

            WebElement successElementYes = driver.findElement(By.xpath("//span[@class='text-success']"));
            String successElementTextYes = successElementYes.getText();

            Assert.assertEquals(successElementTextYes, "Yes");

        }

        @Test(description = "Перейти на страницу с Радиобаттоном и отметить Радиобаттон 'Impressive'")
        public void step_02(){
            driver.get("https://demoqa.com/radio-button");
            WebElement impressiveRadio = driver.findElement(By.xpath("//label [@for='impressiveRadio']"));
            impressiveRadio.click();

            WebElement successElementImpressive = driver.findElement(By.xpath("//span[@class='text-success']"));
            String successElementTextImpressive = successElementImpressive.getText();

            Assert.assertEquals(successElementTextImpressive, "Impressive");


        }
}
