package sitefinity;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.PrivacyPolicyPage;
import pages.SitefinityPage;

import static org.testng.Assert.*;

public class SitefinityTest extends BaseTest {

    @Test
    public void verifyPageHeader() {
        ContactPage contactPage = homePage.clickContactUsLink();
        SitefinityPage sitefinityPage = contactPage.clickSitefinityQuestionsLink();
        assertEquals(sitefinityPage.getPageHeader(), "Contact Us",
                "Page header is incorrect!");
    }

    @Test
    public void verifyPageParagraph() {
        ContactPage contactPage = homePage.clickContactUsLink();
        SitefinityPage sitefinityPage = contactPage.clickSitefinityQuestionsLink();
        assertEquals(sitefinityPage.getPageParagraph(), "You’ll hear from our representative within one business day.",
                "Page paragraph is incorrect!");
    }

    @Test
    public void testTalkToUsForm() {
        ContactPage contactPage = homePage.clickContactUsLink();
        SitefinityPage sitefinityPage = contactPage.clickSitefinityQuestionsLink();
        sitefinityPage.setFirstNameField("First name");
        sitefinityPage.setLastNameField("Last name");
        sitefinityPage.setEmailField("test.automation@gmail.com");
        sitefinityPage.selectYourCountry("Bulgaria");
        sitefinityPage.setPhoneNumberField("0881234567");
        sitefinityPage.setMessageField("Optional message!");
        sitefinityPage.selectAcceptTermsCheckbox();
    }

    @Test
    public void testPrivacyPolicyLink() {
        ContactPage contactPage = homePage.clickContactUsLink();
        SitefinityPage sitefinityPage = contactPage.clickSitefinityQuestionsLink();
        PrivacyPolicyPage privacyPolicyPage = sitefinityPage.clickPrivacyPolicyLink();
        assertEquals(privacyPolicyPage.getPageTitle(), "Privacy Policy - Progress",
                "Page title is incorrect!");
    }
}
