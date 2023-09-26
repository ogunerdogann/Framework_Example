package enums;

import org.junit.Assert;

import static hooks.Hooks.commonPage;
import static hooks.Hooks.driver;

public enum NAVBAR {
    HOME_PAGE("KesifPlus - Bireysel ve Kurumsal Çözümler!", "https://test.kesifplus.com/", 0),
    ABOUT_US_PAGE("KesifPlus - Bireysel ve Kurumsal Çözümler!", "https://test.kesifplus.com/about-us", 1),
    CONTACT_US_PAGE("KesifPlus - Bireysel ve Kurumsal Çözümler!", "https://test.kesifplus.com/contact-us", 2),
    CONSULTING_PAGE("KesifPlus - Bireysel ve Kurumsal Çözümler!", "https://test.kesifplus.com/consulting", 3),
    ACCOUNT_PAGE("KesifPlus - Bireysel ve Kurumsal Çözümler!", "https://test.kesifplus.com/login", 4);

    private String url;
    private int index;
    private String title;

    NAVBAR(String title, String url, int index) {
        this.title = title;
        this.url = url;
        this.index = index;
    }

    public void verifiziereUrl() {
        Assert.assertEquals(this.url, driver.getCurrentUrl());
    }

    public void verifiziereTitle() {
        Assert.assertEquals(this.title, driver.getTitle());

    }

    public void clickPage() {
        commonPage.getHomePage().clickPage(this.index);
    }

}
