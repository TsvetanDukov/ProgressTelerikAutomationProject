package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SitefinityPage {

    private WebDriver driver;
    private By pageHeader = By.xpath("//div[@class = 'sfContentBlock']/h1");
    private By pageParagraph = By.xpath("//div[@class = 'sfContentBlock']/p");
    private By firstNameField = By.id("GeneralContent_C025_ctl00_ctl00_C003_ctl00_ctl00_textBox_write");
    private By lastNameField = By.id("GeneralContent_C025_ctl00_ctl00_C004_ctl00_ctl00_textBox_write");
    private By emailField = By.id("GeneralContent_C025_ctl00_ctl00_C001_ctl00_ctl00_textBox_write");
    private By selectCountry = By.id("GeneralContent_C025_ctl00_ctl00_Country_ctl00_ctl00_dropDown");
    private By phoneNumberField = By.id("GeneralContent_C025_ctl00_ctl00_C005_ctl00_ctl00_textBox_write");
    private By messageField = By.id("GeneralContent_C025_ctl00_ctl00_C042_ctl00_ctl00_textBox_write");
    private By contactUsButton = By.id("GeneralContent_C025_ctl00_ctl00_C017");
    private By acceptTermsCheckbox = By.id("GeneralContent_C025_ctl00_ctl00_EuropeAndCanadaCheckbox_ctl00_ctl00_iAgreeCheckbox");
    private By privacyPolicyLink = By.xpath("//label[@id = 'GeneralContent_C025_ctl00_ctl00_C001_ctl00_ctl00_titleLabel_write']/a");


    public SitefinityPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageHeader() {
        return driver.findElement(pageHeader).getText();
    }

    public String getPageParagraph() {
        return driver.findElement(pageParagraph).getText();
    }

    public void setFirstNameField(String name) {
        driver.findElement(firstNameField).sendKeys(name);
    }

    public void setLastNameField(String name) {
        driver.findElement(lastNameField).sendKeys(name);
    }

    public void setEmailField(String name) {
        driver.findElement(emailField).sendKeys(name);
    }

    public void selectYourCountry(String country) {
        WebElement selectMenu = driver.findElement(selectCountry);
        Select select = new Select(selectMenu);
        select.selectByVisibleText(country);
    }

    public void setPhoneNumberField(String number) {
        driver.findElement(phoneNumberField).sendKeys(number);
    }

    public void setMessageField(String message) {
        driver.findElement(messageField).sendKeys(message);
    }

    public void clickContactUsButton() {
        driver.findElement(contactUsButton).click();
    }

    public void selectAcceptTermsCheckbox() {
        driver.findElement(acceptTermsCheckbox).click();
    }

    public PrivacyPolicyPage clickPrivacyPolicyLink() {
        driver.findElement(privacyPolicyLink).click();
        return new PrivacyPolicyPage(driver);
    }
}
