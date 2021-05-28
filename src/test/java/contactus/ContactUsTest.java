package contactus;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.*;

public class ContactUsTest extends BaseTest {

    @Test
    public void testContactFormFieldsAreDisplayed() {
        ContactPage contactPage = homePage.clickContactUsLink();
        assertTrue(contactPage.isSelectOptionDropdownDisplayed(),
                "Select option field is not displayed!");
        assertTrue(contactPage.isSelectProductDisplayed(),
                "Select product is not displayed!");
        assertTrue(contactPage.isFirstNameFieldDisplayed(),
                "First name field is not displayed!");
        assertTrue(contactPage.isLastNameFieldDisplayed(),
                "Last name field is not displayed!");
        assertTrue(contactPage.isBusinessEmailFieldDisplayed(),
                "Business email field is not displayed!");
        assertTrue(contactPage.isCompanyFieldDisplayed(),
                "Company name field is not displayed!");
        assertTrue(contactPage.isCountryFieldDisplayed(),
                "Country field is not displayed!");
        assertTrue(contactPage.isPhoneNumberFieldDisplayed(),
                "Phone number field is not displayed!");
        assertTrue(contactPage.isCommentsFieldDisplayed(),
                "Comments field is not displayed!");
        assertTrue(contactPage.isContactUsButtonDisplayed(),
                "Contact us button is not displayed!");
    }

    @Test
    public void testGetInTouchFormFields() {
        ContactPage contactPage = homePage.clickContactUsLink();
        contactPage.selectOptionField("Product questions");
        contactPage.selectProductField("DevCraft");
        contactPage.enterFirstName("First name");
        contactPage.enterLastName("Last name");
        contactPage.enterBusinessEmail("test.automation@gmail.com");
        contactPage.enterCompanyName("Test Automation");
        contactPage.selectCountryField("Bulgaria");
        contactPage.enterPhoneNumber("088*******");
        contactPage.enterYourCommentHere("Simple comment!");
        acceptCookies();
        assertTrue(contactPage.isAcceptTermsCheckboxDisplayed(),
                "Privacy policy checkbox is not displayed!");
        contactPage.acceptPrivacyPolicy();
        assertTrue(contactPage.isAcceptTermsCheckboxSelected(),
                "Accept terms checkbox is not selected!");
    }

    @Test
    public void testNeedSupportLink() {
        ContactPage contactPage = homePage.clickContactUsLink();
        assertTrue(contactPage.isSupportLinkDisplayed(),
                "Support link is not displayed!");
        LoginPage loginPage = contactPage.clickNeedSupportLink();
        assertEquals(loginPage.getPageTitle(), "Telerik Client Login",
                "Page title is incorrect!");
    }

    @Test
    public void testTrainingAndConsultingLink() {
        ContactPage contactPage = homePage.clickContactUsLink();
        assertTrue(contactPage.isTrainingAndServicesLinkDisplayed(),
                "Training and Consulting link is not displayed!");
        ServicesPage servicesPage = contactPage.clickTrainingAndConsultingLink();
        assertEquals(servicesPage.getPageTitle(),
                "App Development, Consulting, Training and Outsourcing Services - Telerik",
                "Page title is incorrect!");
    }

    @Test
    public void testNeedQuoteLink() {
        ContactPage contactPage = homePage.clickContactUsLink();
        assertTrue(contactPage.isRequestQuoteLinkDisplayed(),
                "Request quote link is not displayed!");
        RequestQuotePage requestQuotePage = contactPage.clickNeedQuoteRequestLink();
        assertEquals(requestQuotePage.getPageTitle(), "Request a Quote",
                "Page title is incorrect!");
    }

    @Test
    public void testSitefinityQuestionsLink() {
        ContactPage contactPage = homePage.clickContactUsLink();
        assertTrue(contactPage.isSitefinityQuestionsLinkDisplayed(),
                "Sitefinity Questions link is not displayed!");
        SitefinityPage sitefinityPage = contactPage.clickSitefinityQuestionsLink();
        assertEquals(sitefinityPage.getPageTitle(), "Contact - Sitefinity",
                "Page title is incorrect!");
    }
}
