package requestquote;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.RequestQuotePage;

import static org.testng.Assert.*;

public class RequestQuoteTest extends BaseTest {

    @Test
    public void verifyPageHeader() {
        ContactPage contactPage = homePage.clickContactUsLink();
        RequestQuotePage requestQuotePage = contactPage.clickNeedQuoteRequestLink();
        assertEquals(requestQuotePage.getPageTitle(), "Request a Quote",
                "Page title is incorrect!");
    }

    @Test
    public void verifyParagraphText() {
        ContactPage contactPage = homePage.clickContactUsLink();
        RequestQuotePage requestQuotePage = contactPage.clickNeedQuoteRequestLink();
        assertEquals(requestQuotePage.getParagraphText(), "You'll be sent a quote to sign – " +
                "once it's signed and returned, we'll active your " +
                "licenses and send you an invoice with NET 30 payment terms.",
                "Paragraph text is incorrect!");
    }

    @Test
    public void testGetYourQuoteForm() {
        ContactPage contactPage = homePage.clickContactUsLink();
        RequestQuotePage requestQuotePage = contactPage.clickNeedQuoteRequestLink();
        //First page test
        assertTrue(requestQuotePage.isQuotationOrEstimateRadioButtonDisplayed(),
                "Quotation/Estimate button is not displayed!");
        requestQuotePage.clickProformaInvoiceRadioButton();
        assertTrue(requestQuotePage.isLicenseUpdateRadioButtonDisplayed(),
                "License update radio button is not displayed!");
        requestQuotePage.clickLicenseUpdateRadioButton();
        assertTrue(requestQuotePage.isProductOfInterestMenuDisplayed(),
                "Product of Interest menu is not displayed!");
        requestQuotePage.selectProductOfInterestField("UI for Blazor");
        assertTrue(requestQuotePage.isUltimateSupportRadioButtonDisplayed(),
                "Ultimate Support radio button is not displayed");
        requestQuotePage.clickUltimateSupportRadioButton();
        assertTrue(requestQuotePage.isNumberOfLicenseDropdownDisplayed(),
                "Number of License dropdown is not displayed!");
        requestQuotePage.selectNumberOfLicense("4");
        assertTrue(requestQuotePage.isSubscriptionPeriodDropdownDisplayed(),
                "Subscription period is not displayed");
        requestQuotePage.selectSubscriptionPeriod("2 Years");
        assertTrue(requestQuotePage.isNextButtonDisplayed(),
                "Next button is not displayed!");
        requestQuotePage.clickNextButton();
        //Second page test
        acceptCookies();
        requestQuotePage.setFirstNameField("First name");
        requestQuotePage.setLastNameField("Last name");
        requestQuotePage.setWorkEmailField("test.automation@gmail.com");
        requestQuotePage.setCompanyName("Company name");
        requestQuotePage.setCountryField("Bulgaria");
        requestQuotePage.setPhoneNumberField("0881234567");
        requestQuotePage.setCityField("Sofia");
        requestQuotePage.setPostalCodeField("1309");
        requestQuotePage.setAddressField("Address");
        requestQuotePage.setVatIDField("vat id");
        assertTrue(requestQuotePage.isAcceptTermsCheckboxDisplayed(),
                "Accept terms checkbox is not displayed!");
        requestQuotePage.clickAcceptTermsCheckbox();
        requestQuotePage.clickNextButtonPage2();
        //Third page test
        requestQuotePage.clickNextButtonPage3();
        //Forth page test
        requestQuotePage.addAdditionalComments("Additional comment");
        requestQuotePage.clickPreviousButtonPage3();
        requestQuotePage.clickPreviousButtonPage2();
        requestQuotePage.clickPreviousButtonPage1();
    }
}
