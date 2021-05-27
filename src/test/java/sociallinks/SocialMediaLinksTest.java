package sociallinks;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FacebookPage;
import pages.LinkedInPage;
import pages.TwitchPage;
import pages.TwitterPage;

import static org.testng.Assert.*;

public class SocialMediaLinksTest extends BaseTest {

    @Test
    public void testFacebookLink() {
        FacebookPage facebookPage = homePage.clickFacebookLink();
        assertEquals(facebookPage.getPageTitle(), "Progress Telerik - Начало | Facebook",
                "Page title is incorrect!");
    }

    @Test
    public void testTwitterLink() {
        TwitterPage twitterPage = homePage.clickTwitterLink();
        assertEquals(twitterPage.getPageTitle(), "Profile / Twitter",
                "Page title is incorrect!");
    }

    @Test
    public void testLinkedInLink() {
        LinkedInPage linkedInPage = homePage.clickLinkedInLink();
        assertEquals(linkedInPage.getPageTitle(), "Progress Telerik | LinkedIn",
                "Page title is incorrect!");
    }

    @Test
    public void testTwitchLink() {
        TwitchPage twitchPage = homePage.clickTwitchLink();
        assertEquals(twitchPage.getPageTitle(), "CodeItLive - Twitch",
                "Page title is incorrect!");
    }
}
