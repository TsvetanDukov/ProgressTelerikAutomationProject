package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemosPage {

    private WebDriver driver;
    private By telerikLogoLink = By.cssSelector("a.TK-TLRK-Logo");

    public DemosPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public HomePage clickTelerikLogoLink() {
        driver.findElement(telerikLogoLink).click();
        return new HomePage(driver);
    }
}
