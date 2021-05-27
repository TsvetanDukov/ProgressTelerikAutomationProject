package search;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SearchPage;

import static org.testng.Assert.*;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchField() {
        SearchPage searchPage = homePage.clickSearchLink();
        acceptCookies();
        assertTrue(searchPage.isSearchFieldDisplayed(), "Search field is not displayed!");
        searchPage.enterTextInSearchField("automated testing");
        assertTrue(searchPage.isSearchButtonDisplayed(), "Search button is not displayed!");
        searchPage.clickSearchButton();
    }

    @Test
    public void testNextPageButton() {
        SearchPage searchPage = homePage.clickSearchLink();
        acceptCookies();
        assertTrue(searchPage.isSearchFieldDisplayed(), "Search field is not displayed!");
        searchPage.enterTextInSearchField("test");
        assertTrue(searchPage.isSearchButtonDisplayed(), "Search button is not displayed!");
        searchPage.clickSearchButton();
        implicitSynchronization();
        searchPage.scrollToElement();
        assertTrue(searchPage.isNextPageButtonDisplayed(), "Next page button is not displayed!");
        searchPage.clickNextPageButton();
    }
}
