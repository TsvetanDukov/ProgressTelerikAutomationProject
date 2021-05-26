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
        DemosPage demosPage = homePage.clickDemosLink();
        HomePage homePage1 = demosPage.clickTelerikLogoLink();
        assertEquals(homePage1.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
        ServicesPage servicesPage = homePage1.clickServicesLink();
        HomePage homePage2 = servicesPage.clickTelerikLogoLink();
        assertEquals(homePage2.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
        SupportPage supportPage = homePage2.clickDocsAndSupportLink();
        HomePage homePage3 = supportPage.clickTelerikLogoLink();
        assertEquals(homePage3.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
        PricingPage pricingPage = homePage3.clickPricingLink();
        HomePage homePage4 = pricingPage.clickTelerikLogoLink();
        assertEquals(homePage4.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
        SearchPage searchPage = homePage4.clickSearchLink();
        HomePage homePage5 = searchPage.clickTelerikLogoLink();
        assertEquals(homePage5.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
        PricingPage pricingPage1 = homePage5.clickShoppingCartLink();
        HomePage homePage6 = pricingPage1.clickTelerikLogoLink();
        assertEquals(homePage6.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
        LoginPage loginPage = homePage6.clickAccountLink();
        HomePage homePage7 = loginPage.clickTelerikLogoLink();
        assertEquals(homePage7.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
        ContactPage contactPage = homePage7.clickContactUsLink();
        HomePage homePage8 = contactPage.clickTelerikLogoLink();
        assertEquals(homePage8.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
        DownloadPage downloadPage = homePage8.clickFreeTrailLink();
        HomePage homePage9 = downloadPage.clickTelerikLogoLink();
        assertEquals(homePage9.getPageTitle(),
                "Telerik & Kendo UI - .NET Components Suites & JavaScript UI Libraries",
                "Page title is incorrect!");
    }
}
