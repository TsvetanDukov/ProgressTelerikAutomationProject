package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactPage {

    private WebDriver driver;
    private By telerikLogoLink = By.cssSelector("a.TK-TLRK-Logo");
    private By contactFormHeader = By.xpath("//div[contains(@id, 'formControls')]/h2");
    private By selectOptionDropdown = By.id("GeneralContent_C020_ctl00_ctl00_C029_ctl00_ctl00_dropDown");
    private By selectProductDropdown = By.id("GeneralContent_C020_ctl00_ctl00_C038_ctl00_ctl00_dropDown");
    private By firstName = By.id("GeneralContent_C020_ctl00_ctl00_C019_ctl00_ctl00_textBox_write");
    private By lastName = By.id("GeneralContent_C020_ctl00_ctl00_C020_ctl00_ctl00_textBox_write");
    private By businessEmail = By.id("GeneralContent_C020_ctl00_ctl00_C018_ctl00_ctl00_textBox_write");
    private By companyName = By.id("GeneralContent_C020_ctl00_ctl00_C021_ctl00_ctl00_textBox_write");
    private By selectCountry = By.id("GeneralContent_C020_ctl00_ctl00_Country_ctl00_ctl00_dropDown");
    private By phoneNumber = By.id("GeneralContent_C020_ctl00_ctl00_C024_ctl00_ctl00_textBox_write");
    private By commentsField = By.id("GeneralContent_C020_ctl00_ctl00_C030_ctl00_ctl00_textBox_write");
    private By contactUsButton = By.id("GeneralContent_C020_ctl00_ctl00_C002");
    private By acceptTerms = By.id("GeneralContent_C020_ctl00_ctl00_EuropeAndCanadaCheckbox_ctl00_ctl00_iAgreeCheckbox");
    private By needSupportLink = By.linkText("Need Support?");
    private By trainingAndConsultingLink = By.linkText("Training, Services and Consulting");
    private By needQuoteLink = By.linkText("Need a Quote?");
    private By sitefinityQuestionsLink = By.linkText("Sitefinity Questions?");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public HomePage clickTelerikLogoLink() {
        driver.findElement(telerikLogoLink).click();
        return new HomePage(driver);
    }

    public String getContactFormHeader() {
        return driver.findElement(contactFormHeader).getText();
    }

    public void selectOptionField(String text) {
        WebElement selectMenu = driver.findElement(selectOptionDropdown);
        Select select = new Select(selectMenu);
        select.selectByVisibleText(text);
    }

    public void selectProductField(String text) {
        WebElement selectMenu = driver.findElement(selectProductDropdown);
        Select select = new Select(selectMenu);
        select.selectByVisibleText(text);
    }

    public void enterFirstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void enterLastName(String name) {
        driver.findElement(lastName).sendKeys(name);
    }

    public void enterBusinessEmail(String email) {
        driver.findElement(businessEmail).sendKeys(email);
    }

    public void enterCompanyName(String company) {
        driver.findElement(companyName).sendKeys(company);
    }

    public void selectCountryField(String text) {
        WebElement country = driver.findElement(selectCountry);
        Select selectMenu = new Select(country);
        selectMenu.selectByVisibleText(text);
    }

    public void enterPhoneNumber(String number) {
        driver.findElement(phoneNumber).sendKeys(number);
    }

    public void enterYourCommentHere(String comment) {
        driver.findElement(commentsField).sendKeys(comment);
    }

    public void pressContactUsButton() {
        driver.findElement(contactUsButton).click();
    }

    public boolean isSelectOptionDropdownDisplayed() {
        return driver.findElement(selectOptionDropdown).isDisplayed();
    }

    public boolean isSelectProductDisplayed() {
        return driver.findElement(selectProductDropdown).isDisplayed();
    }

    public boolean isFirstNameFieldDisplayed() {
        return driver.findElement(firstName).isDisplayed();
    }

    public boolean isLastNameFieldDisplayed() {
        return driver.findElement(lastName).isDisplayed();
    }

    public boolean isBusinessEmailFieldDisplayed() {
        return driver.findElement(businessEmail).isDisplayed();
    }

    public boolean isCompanyFieldDisplayed() {
        return driver.findElement(companyName).isDisplayed();
    }

    public boolean isCountryFieldDisplayed() {
        return driver.findElement(selectCountry).isDisplayed();
    }

    public boolean isPhoneNumberFieldDisplayed() {
        return driver.findElement(phoneNumber).isDisplayed();
    }

    public boolean isCommentsFieldDisplayed() {
        return driver.findElement(commentsField).isDisplayed();
    }

    public boolean isContactUsButtonDisplayed() {
        return driver.findElement(contactUsButton).isDisplayed();
    }

    public void acceptPrivacyPolicy() {
        driver.findElement(acceptTerms).click();
    }

    public boolean isAcceptTermsCheckboxDisplayed() {
        return driver.findElement(acceptTerms).isDisplayed();
    }

    public boolean isAcceptTermsCheckboxSelected() {
        return driver.findElement(acceptTerms).isSelected();
    }

    public LoginPage clickNeedSupportLink() {
        driver.findElement(needSupportLink).click();
        return new LoginPage(driver);
    }

    public boolean isSupportLinkDisplayed() {
        return driver.findElement(needSupportLink).isDisplayed();
    }

    public ServicesPage clickTrainingAndConsultingLink() {
        driver.findElement(trainingAndConsultingLink).click();
        return new ServicesPage(driver);
    }

    public boolean isTrainingAndServicesLinkDisplayed() {
        return driver.findElement(trainingAndConsultingLink).isDisplayed();
    }

    public RequestQuotePage clickNeedQuoteRequestLink() {
        driver.findElement(needQuoteLink).click();
        return new RequestQuotePage(driver);
    }

    public boolean isRequestQuoteLinkDisplayed() {
        return driver.findElement(needQuoteLink).isDisplayed();
    }

    public SitefinityPage clickSitefinityQuestionsLink() {
        driver.findElement(sitefinityQuestionsLink).click();
        return new SitefinityPage(driver);
    }

    public boolean isSitefinityQuestionsLinkDisplayed() {
        return driver.findElement(sitefinityQuestionsLink).isDisplayed();
    }
}
