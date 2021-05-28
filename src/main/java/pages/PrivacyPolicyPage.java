package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PrivacyPolicyPage {

    private WebDriver driver;
    private By privacyLinks = By.xpath("//div[@id = 'GeneralContent_C018_Col01']/ul/li/a");

    public PrivacyPolicyPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void findParticularPrivacyLink(String linkName) {
        List<WebElement> links = driver.findElements(privacyLinks);
        for (WebElement link : links) {
            String linkTitle = link.getText();
            if (linkTitle.equalsIgnoreCase(linkName)) {
                driver.findElement(privacyLinks).click();
            }
        }
    }

    public void openAllLinksInNewWindow() {
        List<WebElement> links = driver.findElements(privacyLinks);
        Iterator<WebElement> it = links.iterator();
        while (it.hasNext()) {
            it.next().sendKeys(Keys.CONTROL, Keys.ENTER);
        }
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        while (itr.hasNext()) {
            driver.switchTo().window(itr.next()).getTitle();
        }
    }
}
