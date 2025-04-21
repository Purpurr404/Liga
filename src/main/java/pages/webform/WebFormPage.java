package pages.webform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

public class WebFormPage extends BasePage {

    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    private static final String URL_WEB_FORM_PAGE = "https://www.selenium.dev/selenium/web/web-form.html";

    private static final String FILL_WEB_FORM_PAGE = "//input[@name='%s']";

    private static final String CHECK_BOX_INPUT_XPATH = "(//input[@name='my-check'])[1]";


    public void openWebFormPage() {
        openUrl(URL_WEB_FORM_PAGE);
    }


    public boolean getCheckBoxState(String checkBoxName) {
        return findElement(By.xpath(String.format(CHECK_BOX_INPUT_XPATH))).isSelected();
//    public void fillWebFormPage (String key) {
//        sendKeys(By.xpath(String.format(FILL_WEB_FORM_PAGE)));
//    }
    }
}
