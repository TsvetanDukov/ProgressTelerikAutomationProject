package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    private WebDriver driver;
    private By emailField = By.id("Email-1");
    private By firstNameField = By.id("Textbox-1");
    private By lastNameField = By.id("Textbox-2");
    private By companyField = By.id("Textbox-3");
    private By phoneField = By.id("Textbox-4");
    private By selectCountry = By.id("Country-1");
    private By createAccountButton = By.xpath("//div[@class = 'sf-fieldWrp']/button");
    private By backToLogin = By.cssSelector("a[class *= 'Link--prev']");
    private By formHeader = By.cssSelector("h4.u-mb2");


    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterFirstName(String name) {
        driver.findElement(firstNameField).sendKeys(name);
    }

    public void enterLastName(String name) {
        driver.findElement(lastNameField).sendKeys(name);
    }

    public void enterCompanyName(String name) {
        driver.findElement(companyField).sendKeys(name);
    }

    public void enterPhoneNumber(String number) {
        driver.findElement(phoneField).sendKeys(number);
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }

    public void clickBackToLogin() {
        driver.findElement(backToLogin).click();
    }

    public void setSelectCountry(String country) {
        WebElement menu = driver.findElement(selectCountry);
        Select select = new Select(menu);
        select.selectByVisibleText(country);
    }

    public boolean isBackToLoginLinkDisplayed() {
        return driver.findElement(backToLogin).isDisplayed();
    }

    public String registrationFormHeader() {
        return driver.findElement(formHeader).getText();
    }

    public boolean isRegistrationFormHeaderDisplayed() {
       return driver.findElement(formHeader).isDisplayed();
    }
}
