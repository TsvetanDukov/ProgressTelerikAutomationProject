package navigationbar;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.*;

public class NavigationBarTests extends BaseTest {

    @Test
    public void testDemosLink() {
        assertTrue(homePage.isDemoLinkDisplayed(), "Demos link is not displayed!");
        DemosPage demosPage = homePage.clickDemosLink();
        assertEquals(demosPage.getPageTitle(),
                "Telerik Product Demos, Examples and Tutorials for all Telerik products",
                "Page title is incorrect!");
    }

    @Test
    public void testServicesLink() {
        assertTrue(homePage.isServicesLinkDisplayed(), "Services link is not displayed!");
        ServicesPage servicesPage = homePage.clickServicesLink();
        assertEquals(servicesPage.getPageTitle(),
                "App Development, Consulting, Training and Outsourcing Services - Telerik",
                "Page title is incorrect!");
    }

    @Test
    public void testBlogsLink() {
        assertTrue(homePage.isBlogsLinkDisplayed(), "Blogs link is not displayed!");
        BlogsPage blogsPage = homePage.clickBlogsLink();
        assertEquals(blogsPage.getPageTitle(),
                "What's New in .NET and JavaScript Developer Tooling - Telerik Blogs",
                "Page title is incorrect!");

    }

    @Test
    public void testDocsAndSupportLink() {
        assertTrue(homePage.isDocsAndSupportLinkDisplayed(), "Docs&Support link is not displayed!");
        SupportPage supportPage = homePage.clickDocsAndSupportLink();
        assertEquals(supportPage.getPageTitle(),
                "Support and Learning | Telerik",
                "Page title is incorrect!");
    }

    @Test
    public void testPricingLink() {
        assertTrue(homePage.isPricingLinkDisplayed(), "Pricing link is not displayed!");
        PricingPage pricingPage = homePage.clickPricingLink();
        assertEquals(pricingPage.getPageTitle(),
                "Purchase Telerik Software Development Tools",
                "Page title is incorrect!");
    }

    @Test
    public void testSearchLink() {
        assertTrue(homePage.isSearchLinkDisplayed(), "Search link is not displayed!");
        SearchPage searchPage = homePage.clickSearchLink();
        assertEquals(searchPage.getPageTitle(), "Search Results",
                "Page title is incorrect!");
    }

    @Test
    public void testShoppingCartLink() {
        /**
         * While shopping cart is empty, user will be redirected to "Pricing page"
         */
        assertTrue(homePage.isShoppingCartLinkDisplayed(), "Search link is not displayed!");
        PricingPage pricingPage = homePage.clickShoppingCartLink();
        assertEquals(pricingPage.getPageTitle(), "Purchase Telerik Software Development Tools",
                "Page title is incorrect!");
    }

    @Test
    public void testAccountLink() {
        assertTrue(homePage.isAccountLinkDisplayed(), "Account link is not displayed!");
        LoginPage loginPage = homePage.clickAccountLink();
        assertEquals(loginPage.getPageTitle(), "Telerik Client Login",
                "Page title is incorrect!");
    }

    @Test
    public void testContactUsLink() {
        assertTrue(homePage.isContactUsLinkDisplayed(), "Contact us link is not displayed!");
        ContactPage contactPage = homePage.clickContactUsLink();
        assertEquals(contactPage.getPageTitle(),
                "Contact the Telerik Team | Progress Telerik",
                "Page title is incorrect!");
    }

    @Test
    public void testFreeTrailLink() {
        assertTrue(homePage.isFreeTrailLinkDisplayed(), "Free trail link is not displayed!");
        DownloadPage downloadPage = homePage.clickFreeTrailLink();
        assertEquals(downloadPage.getPageTitle(), "Download trials and sign up for services | Telerik",
                "Page title is incorrect!");
    }

    @Test
    public void testTelerikLogoLink() {
        assertTrue(homePage.isTelerikLogoLinkDisplayed(), "Telerik logo link is not displayed!");
        BlogsPage blogsPage = homePage.clickBlogsLink();
        HomePage homePage = blogsPage.clickTelerikLogoLink();
        assertEquals(homePage.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
    }
}
