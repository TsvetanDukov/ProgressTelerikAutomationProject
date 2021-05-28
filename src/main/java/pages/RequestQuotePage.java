package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RequestQuotePage {

    private WebDriver driver;
    private By pageHeader = By.xpath("//div[@id = 'GeneralContent_C020_Col00']/h1");
    private By pageParagraphText = By.xpath("//div[@id = 'GeneralContent_C020_Col00']/p");
    private By quotationOrEstimateRadioButton = By.id("GeneralContent_C027_ctl00_ctl00_ctl00_C040_ctl00_ctl00_radioButtons_radiobuttons_0");
    private By proformaInvoiceRadioButton = By.id("GeneralContent_C027_ctl00_ctl00_ctl00_C040_ctl00_ctl00_radioButtons_radiobuttons_1");
    private By newLicenseRadioButton = By.id("GeneralContent_C027_ctl00_ctl00_ctl00_C041_ctl00_ctl00_radioButtons_radiobuttons_0");
    private By licenseUpdateRadioButton = By.id("GeneralContent_C027_ctl00_ctl00_ctl00_C041_ctl00_ctl00_radioButtons_radiobuttons_1");
    private By licenseRenewalRadioButton = By.id("GeneralContent_C027_ctl00_ctl00_ctl00_C041_ctl00_ctl00_radioButtons_radiobuttons_2");
    private By productOfInterestDropdown = By.id("GeneralContent_C027_ctl00_ctl00_ctl00_C043_ctl00_ctl00_dropDown");
    private By liteSupportRadioButton = By.xpath("//li[@data-value = 'Lite Support']/span");
    private By prioritySupportRadioButton = By.xpath("//li[@data-value = 'Priority Support']/span");
    private By ultimateSupportRadioButton = By.xpath("//li[@data-value = 'Ultimate Support']/span");
    private By numberOfLicenseDropdown = By.id("GeneralContent_C027_ctl00_ctl00_ctl00_C045_ctl00_ctl00_dropDown");
    private By subscriptionPeriodDropdown = By.id("GeneralContent_C027_ctl00_ctl00_ctl00_C046_ctl00_ctl00_dropDown");
    private By nextButton = By.id("GeneralContent_C027_ctl00_ctl00_ctl00_C031_ctl00_ctl00_btnNext");
    private By firstName = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C003_ctl00_ctl00_textBox_write");
    private By lastName = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C011_ctl00_ctl00_textBox_write");
    private By workEmail = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C078_ctl00_ctl00_textBox_write");
    private By companyName = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C006_ctl00_ctl00_textBox_write");
    private By selectCountry = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_Country_ctl00_ctl00_dropDown");
    private By phoneNumber = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C008_ctl00_ctl00_textBox_write");
    private By cityField = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C048_ctl00_ctl00_textBox_write");
    private By postalCodeField = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C049_ctl00_ctl00_textBox_write");
    private By addressField = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C050_ctl00_ctl00_textBox_write");
    private By vatID = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C051_ctl00_ctl00_textBox_write");
    private By acceptTermsCheckbox = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_EuropeAndCanadaCheckbox_ctl00_ctl00_iAgreeCheckbox");
    private By nextButtonPage2 = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C052_ctl00_ctl00_btnNext");
    private By nextButtonPage3 = By.id("GeneralContent_C027_ctl00_ctl00_C056_ctl00_ctl00_btnNext");
    private By additionalComments = By.id("GeneralContent_C027_ctl00_ctl00_ctl07_C057_ctl00_ctl00_textBox_write");
    private By submitButton = By.id("GeneralContent_C027_ctl00_ctl00_ctl07_C101");
    private By previousButtonPage3 = By.id("GeneralContent_C027_ctl00_ctl00_ctl07_C058_ctl00_ctl00_btnPrevious");
    private By previousButtonPage2 = By.id("GeneralContent_C027_ctl00_ctl00_C055_ctl00_ctl00_btnPrevious");
    private By previousButtonPage1 = By.id("GeneralContent_C027_ctl00_ctl00_ctl01_C037_ctl00_ctl00_btnPrevious");


    public RequestQuotePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getParagraphText() {
        return driver.findElement(pageParagraphText).getText();
    }

    public void clickQuotationOrEstimateRadioButton() {
        driver.findElement(quotationOrEstimateRadioButton).click();
    }

    public void clickProformaInvoiceRadioButton() {
        driver.findElement(proformaInvoiceRadioButton).click();
    }

    public boolean isQuotationOrEstimateRadioButtonDisplayed() {
        return driver.findElement(quotationOrEstimateRadioButton).isDisplayed();
    }

    public boolean isProformaInvoiceRadioButtonDisplayed() {
        return driver.findElement(proformaInvoiceRadioButton).isDisplayed();
    }

    public void clickNewLicenseRadioButton() {
        driver.findElement(newLicenseRadioButton).click();
    }

    public boolean isNewLicenseRadioButtonDisplayed() {
        return driver.findElement(newLicenseRadioButton).isDisplayed();
    }

    public void clickLicenseUpdateRadioButton() {
        driver.findElement(licenseUpdateRadioButton).click();
    }

    public boolean isLicenseUpdateRadioButtonDisplayed() {
        return driver.findElement(licenseUpdateRadioButton).isDisplayed();
    }

    public void clickLicenseRenewalRadioButton() {
        driver.findElement(licenseRenewalRadioButton).click();
    }

    public boolean isLicenseRenewalRadioButtonDisplayed() {
        return driver.findElement(licenseRenewalRadioButton).isDisplayed();
    }

    public void selectProductOfInterestField(String text) {
        WebElement selectMenu = driver.findElement(productOfInterestDropdown);
        Select select = new Select(selectMenu);
        select.selectByVisibleText(text);
    }

    public boolean isProductOfInterestMenuDisplayed() {
        return driver.findElement(productOfInterestDropdown).isDisplayed();
    }

    public void clickLiteSupportRadioButton() {
        driver.findElement(liteSupportRadioButton).click();
    }

    public void clickPrioritySupportRadioButton() {
        driver.findElement(prioritySupportRadioButton).click();
    }

    public void clickUltimateSupportRadioButton() {
        driver.findElement(ultimateSupportRadioButton).click();
    }

    public boolean isLiteSupportRadioButtonDisplayed() {
        return driver.findElement(liteSupportRadioButton).isDisplayed();
    }

    public boolean isPrioritySupportRadioButtonDisplayed() {
        return driver.findElement(prioritySupportRadioButton).isDisplayed();
    }

    public boolean isUltimateSupportRadioButtonDisplayed() {
        return driver.findElement(ultimateSupportRadioButton).isDisplayed();
    }

    public void selectNumberOfLicense(String text) {
        WebElement selectMenu = driver.findElement(numberOfLicenseDropdown);
        Select select = new Select(selectMenu);
        select.selectByVisibleText(text);
    }

    public boolean isNumberOfLicenseDropdownDisplayed() {
        return driver.findElement(numberOfLicenseDropdown).isDisplayed();
    }

    public void selectSubscriptionPeriod(String text) {
        WebElement selectMenu = driver.findElement(subscriptionPeriodDropdown);
        Select select = new Select(selectMenu);
        select.selectByVisibleText(text);
    }

    public boolean isSubscriptionPeriodDropdownDisplayed() {
        return driver.findElement(subscriptionPeriodDropdown).isDisplayed();
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    public boolean isNextButtonDisplayed() {
        return driver.findElement(nextButton).isDisplayed();
    }

    public void setFirstNameField(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void setLastNameField(String name) {
        driver.findElement(lastName).sendKeys(name);
    }

    public void setWorkEmailField(String email) {
        driver.findElement(workEmail).sendKeys(email);
    }

    public void setCompanyName(String name) {
        driver.findElement(companyName).sendKeys(name);
    }

    public void setCountryField(String country) {
        WebElement selectMenu = driver.findElement(selectCountry);
        Select select = new Select(selectMenu);
        select.selectByVisibleText(country);
    }

    public void setPhoneNumberField(String number) {
        driver.findElement(phoneNumber).sendKeys(number);
    }

    public void setCityField(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void setPostalCodeField(String code) {
        driver.findElement(postalCodeField).sendKeys(code);
    }

    public void setAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setVatIDField(String id) {
        driver.findElement(vatID).sendKeys(id);
    }

    public void clickAcceptTermsCheckbox() {
        driver.findElement(acceptTermsCheckbox).click();
    }

    public boolean isAcceptTermsCheckboxDisplayed() {
        return driver.findElement(acceptTermsCheckbox).isDisplayed();
    }

    public void clickNextButtonPage2() {
        driver.findElement(nextButtonPage2).click();
    }

    public void clickNextButtonPage3() {
        driver.findElement(nextButtonPage3).click();
    }

    public void addAdditionalComments(String comment) {
        driver.findElement(additionalComments).sendKeys(comment);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public void clickPreviousButtonPage3() {
        driver.findElement(previousButtonPage3).click();
    }

    public void clickPreviousButtonPage2() {
        driver.findElement(previousButtonPage2).click();
    }

    public void clickPreviousButtonPage1() {
        driver.findElement(previousButtonPage1).click();
    }
}
