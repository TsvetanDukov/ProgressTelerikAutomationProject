package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By telerikLogoLink = By.cssSelector("a.TK-TLRK-Logo");
    private By demosLink = By.xpath("//a[@href = '/support/demos']");
    private By servicesLink = By.xpath("//a[@href = '/services']");
    private By blogsLink = By.xpath("//a[@href = '/blogs']");
    private By docsAndSupportLink = By.xpath("//a[@href = '/support']");
    private By pricingLink = By.xpath("//a[@href = '/purchase.aspx']");
    private By searchLink = By.id("js-tlrk-nav-search-link");
    private By shoppingCartLink = By.xpath("//a[contains(@class, 'shopping-cart')]");
    private By accountLink = By.xpath("//a[@title = 'Your Account']");
    private By contactUsLink = By.xpath("//a[@title = 'Contact Us']");
    private By freeTrailLink = By.xpath("//a[@href = '/download']");
    private By facebookLink = By.xpath("//ul[contains(@class, 'Footer-List-Horizontal')]/li");
    private By twitterLink = By.xpath("//ul[contains(@class, 'Footer-List-Horizontal')]/li[2]");
    private By linkedInLink = By.xpath("//ul[contains(@class, 'Footer-List-Horizontal')]/li[3]");
    private By twitchLink = By.xpath("//ul[contains(@class, 'Footer-List-Horizontal')]/li[4]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean isTelerikLogoLinkDisplayed() {
        return driver.findElement(telerikLogoLink).isDisplayed();
    }

    public DemosPage clickDemosLink() {
        driver.findElement(demosLink).click();
        return new DemosPage(driver);
    }

    public boolean isDemoLinkDisplayed() {
        return driver.findElement(demosLink).isDisplayed();
    }

    public ServicesPage clickServicesLink() {
        driver.findElement(servicesLink).click();
        return new ServicesPage(driver);
    }

    public boolean isServicesLinkDisplayed() {
        return driver.findElement(servicesLink).isDisplayed();
    }

    public BlogsPage clickBlogsLink() {
        driver.findElement(blogsLink).click();
        return new BlogsPage(driver);
    }

    public boolean isBlogsLinkDisplayed() {
        return driver.findElement(blogsLink).isDisplayed();
    }

    public SupportPage clickDocsAndSupportLink() {
        driver.findElement(docsAndSupportLink).click();
        return new SupportPage(driver);
    }

    public boolean isDocsAndSupportLinkDisplayed() {
        return driver.findElement(docsAndSupportLink).isDisplayed();
    }

    public PricingPage clickPricingLink() {
        driver.findElement(pricingLink).click();
        return new PricingPage(driver);
    }

    public boolean isPricingLinkDisplayed() {
        return driver.findElement(pricingLink).isDisplayed();
    }

    public SearchPage clickSearchLink() {
        driver.findElement(searchLink).click();
        return new SearchPage(driver);
    }

    public boolean isSearchLinkDisplayed() {
        return driver.findElement(searchLink).isDisplayed();
    }

    public PricingPage clickShoppingCartLink() {
        driver.findElement(shoppingCartLink).click();
        return new PricingPage(driver);
    }

    public boolean isShoppingCartLinkDisplayed() {
        return driver.findElement(shoppingCartLink).isDisplayed();
    }

    public LoginPage clickAccountLink() {
        driver.findElement(accountLink).click();
        return new LoginPage(driver);
    }

    public boolean isAccountLinkDisplayed() {
        return driver.findElement(accountLink).isDisplayed();
    }

    public ContactPage clickContactUsLink() {
        driver.findElement(contactUsLink).click();
        return new ContactPage(driver);
    }

    public boolean isContactUsLinkDisplayed() {
        return driver.findElement(contactUsLink).isDisplayed();
    }

    public DownloadPage clickFreeTrailLink() {
        driver.findElement(freeTrailLink).click();
        return new DownloadPage(driver);
    }

    public boolean isFreeTrailLinkDisplayed() {
        return driver.findElement(freeTrailLink).isDisplayed();
    }

    public FacebookPage clickFacebookLink() {
        driver.findElement(facebookLink).click();
        return new FacebookPage(driver);
    }

    public TwitterPage clickTwitterLink() {
        driver.findElement(twitterLink).click();
        return new TwitterPage(driver);
    }

    public LinkedInPage clickLinkedInLink() {
        driver.findElement(linkedInLink).click();
        return new LinkedInPage(driver);
    }

    public TwitchPage clickTwitchLink() {
        driver.findElement(twitchLink).click();
        return new TwitchPage(driver);
    }
}
