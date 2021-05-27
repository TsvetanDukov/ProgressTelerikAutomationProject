package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginFormHeader() {
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        assertEquals(loginPage.loginFormHeader(), "Use your Telerik account",
                "Login form header is incorrect!");
    }

    @Test
    public void testLoginForm() {
        //Test with invalid credentials
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        loginPage.enterEmail("test.automation.egt@gmail.com");
        loginPage.enterPassword("Supersecretpassword");
        loginPage.clickLoginButton();
    }

    @Test
    public void testLoginFailedMessage() {
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        loginPage.enterEmail("test.automation.egt@gmail.com");
        loginPage.enterPassword("Supersecretpassword");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getLoginFailedText(),
                "This account has not been activated yet. " +
                        "Please use the activation link provided via email to activate the account.",
                "Login failed message is incorrect!");
    }

    @Test
    public void testForgotPasswordLinkHeader() {
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        assertTrue(loginPage.isForgotPasswordLinkDisplayed(), "Forgot password link is not displayed!");
        loginPage.clickForgotPasswordLink();
        assertEquals(loginPage.forgotPasswordFormHeader(), "Forgot your Telerik password?",
                "Forgot password form header is incorrect!");
    }

    @Test
    public void testRecoverForgottenPassword() {
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        loginPage.clickForgotPasswordLink();
        loginPage.enterEmailInToRecoverPassword("test.automation.egt@gmail.com");
        loginPage.scrollToElement();
        loginPage.clickSendButton();
        loginPage.clickBackButton();
    }

    @Test
    public void testDeselectCheckbox() {
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        assertTrue(loginPage.isCheckboxDisplayed(), "Checkbox is not displayed!");
        loginPage.deselectRememberMeCheckbox();
        assertFalse(loginPage.isCheckboxSelected(), "Checkbox is selected");
    }

    @Test
    public void testSelectCheckbox() {
        LoginPage loginPage = homePage.clickAccountLink();
        acceptCookies();
        assertTrue(loginPage.isCheckboxDisplayed(), "Checkbox is not displayed!");
        loginPage.deselectRememberMeCheckbox();
        loginPage.selectRememberMeCheckbox();
        assertTrue(loginPage.isCheckboxSelected(), "Checkbox is not selected!");
    }
}
