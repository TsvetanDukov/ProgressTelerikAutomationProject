package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private By telerikLogoLink = By.cssSelector("a.TK-TLRK-Logo");
    private By createAccountLink = By.xpath("//a[contains(@class, 'register-panel')]");
    private By loginFormHeader = By.cssSelector("h4.u-mb3");
    private By emailField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("LoginButton-1");
    private By loginError = By.xpath("//span[contains(@class, 'login-failed')]");
    private By forgotPasswordLink = By.xpath("//a[contains(@class, 'toggle-forgot')]");
    private By forgotFormHeader = By.xpath("//div[@id = 'forgotPasswordHolder']/h3");
    private By sendButton = By.id("sendRecoveryMailBtn");
    private By forgotEmailField = By.id("mailTextBox");
    private By recoverPasswordMessage = By.xpath("//div[contains(@class, 'Box--success')]");
    private By backButton = By.xpath("//a[contains(@class, 'prev Link')]");
    private By rememberMeCheckbox = By.id("RememberMe");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public HomePage clickTelerikLogoLink() {
        driver.findElement(telerikLogoLink).click();
        return new HomePage(driver);
    }

    public boolean isCreateAccountLinkDisplayed() {
        return driver.findElement(createAccountLink).isDisplayed();
    }

    public CreateAccountPage clickCreateAccountLink() {
        driver.findElement(createAccountLink).click();
        return new CreateAccountPage(driver);
    }

    public String loginFormHeader() {
        return driver.findElement(loginFormHeader).getText();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getLoginFailedText() {
        return driver.findElement(loginError).getText();
    }

    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public boolean isForgotPasswordLinkDisplayed() {
        return driver.findElement(forgotPasswordLink).isDisplayed();
    }

    public String forgotPasswordFormHeader() {
        return driver.findElement(forgotFormHeader).getText();
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }

    public void enterEmailInToRecoverPassword(String email) {
        driver.findElement(forgotEmailField).sendKeys(email);
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
    }

    public void clickBackButton() {
        driver.findElement(backButton).click();
    }

    public boolean isCheckboxDisplayed() {
        return driver.findElement(rememberMeCheckbox).isDisplayed();
    }

    public void deselectRememberMeCheckbox() {
        WebElement checkbox = driver.findElement(rememberMeCheckbox);

        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void selectRememberMeCheckbox() {
        WebElement checkbox = driver.findElement(rememberMeCheckbox);

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isCheckboxSelected() {
        return driver.findElement(rememberMeCheckbox).isSelected();
    }
}
