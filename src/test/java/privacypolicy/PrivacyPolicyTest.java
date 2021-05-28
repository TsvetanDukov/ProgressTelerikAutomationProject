package privacypolicy;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.PrivacyPolicyPage;
import pages.SitefinityPage;

public class PrivacyPolicyTest extends BaseTest {

    @Test
    public void testPrivacyLinks() {
        //Find and click a specific link
        ContactPage contactPage = homePage.clickContactUsLink();
        SitefinityPage sitefinityPage = contactPage.clickSitefinityQuestionsLink();
        PrivacyPolicyPage privacyPolicyPage = sitefinityPage.clickPrivacyPolicyLink();
        privacyPolicyPage.findParticularPrivacyLink("Privacy Center");
    }

    @Test
    public void testOpenAllLinksInNewTabs() {
        //Open all links in new tabs and get page titles
        ContactPage contactPage = homePage.clickContactUsLink();
        SitefinityPage sitefinityPage = contactPage.clickSitefinityQuestionsLink();
        PrivacyPolicyPage privacyPolicyPage = sitefinityPage.clickPrivacyPolicyLink();
        implicitSynchronization();
        privacyPolicyPage.openAllLinksInNewWindow();
    }
}
