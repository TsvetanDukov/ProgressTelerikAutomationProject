package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage {

    private WebDriver driver;
    private By telerikLogoLink = By.cssSelector("a.TK-TLRK-Logo");
    private By searchField = By.xpath("//input[@type = 'search']");
    private By searchButton = By.xpath("//button[@class = 'TK-Tag-Input-Button']");
    private By searchResults = By.xpath("//div[@class = 'SearchResults']/div/ul/li/h4");
    private By availablePageLinks = By.xpath("//div[@class = 'TK-Pager-Links']/a");
    private By previousPageButton = By.xpath("//div[@class = 'TK-Pager-Prev']/a");
    private By nextPageButton = By.xpath("//div[@class ='TK-Pager-Next']/a");


    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public HomePage clickTelerikLogoLink() {
        driver.findElement(telerikLogoLink).click();
        return new HomePage(driver);
    }

    public void enterTextInSearchField(String text) {
        driver.findElement(searchField).sendKeys(text);
    }

    public boolean isSearchFieldDisplayed() {
        return driver.findElement(searchField).isDisplayed();
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public boolean isSearchButtonDisplayed() {
        return driver.findElement(searchButton).isDisplayed();
    }

    public void clickNextPageButton() {
        driver.findElement(nextPageButton).click();
    }

    public void clickPreviousPageButton() {
        driver.findElement(previousPageButton).click();
    }

    public boolean isNextPageButtonDisplayed() {
        return driver.findElement(nextPageButton).isDisplayed();
    }

    public boolean isPreviousPageButtonDisplayed() {
        return driver.findElement(previousPageButton).isDisplayed();
    }

    public void scrollToElement() {
        ((JavascriptExecutor)driver)
                .executeScript("window.scrollBy(0, 1500);");
    }
}
