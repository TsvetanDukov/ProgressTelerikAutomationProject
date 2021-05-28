package pages;

import org.openqa.selenium.WebDriver;

public class SitefinityPage {

    private WebDriver driver;

    public SitefinityPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
