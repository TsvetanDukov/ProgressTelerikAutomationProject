package pages;

import org.openqa.selenium.WebDriver;

public class TwitchPage {

    private WebDriver driver;

    public TwitchPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
