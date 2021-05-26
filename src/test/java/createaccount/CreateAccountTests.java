package createaccount;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.LoginPage;

import static org.testng.Assert.*;

public class CreateAccountTests extends BaseTest {

    @Test
    public void testCreateAccountForm() {
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        assertTrue(loginPage.isCreateAccountLinkDisplayed(), "Create account link is not displayed!");
        CreateAccountPage createAccountPage = loginPage.clickCreateAccountLink();
        createAccountPage.enterEmail("test.automation.egt@gmail.com");
        createAccountPage.enterFirstName("Tsvetan");
        createAccountPage.enterLastName("Dukov");
        createAccountPage.enterCompanyName("None");
        createAccountPage.setSelectCountry("Bulgaria");
        createAccountPage.enterPhoneNumber("0887******");
        createAccountPage.clickCreateAccount();
    }

    @Test
    public void testBackToLoginLink() {
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        CreateAccountPage createAccountPage = loginPage.clickCreateAccountLink();
        assertTrue(createAccountPage.isBackToLoginLinkDisplayed(),
                "Back to Login page link is not displayed!");
        createAccountPage.clickBackToLogin();
    }

    @Test
    public void testRegistrationFormHeader() {
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        CreateAccountPage createAccountPage = loginPage.clickCreateAccountLink();
        assertTrue(createAccountPage.isRegistrationFormHeaderDisplayed(),
                "Header is not displayed!");
        assertEquals(createAccountPage.registrationFormHeader(), "Create an account",
                "Registration form header is incorrect!");
    }
}
