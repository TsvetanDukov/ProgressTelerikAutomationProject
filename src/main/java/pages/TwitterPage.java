package pages;

import org.openqa.selenium.WebDriver;

public class TwitterPage {

    private WebDriver driver;

    public TwitterPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
