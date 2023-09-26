package enums;

import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static hooks.Hooks.commonPage;
import static hooks.Hooks.driver;

public enum SERVICES {
    EDUCATION(0,"https://test.kesifplus.com/consulting/education"),
    CAREER(1,"https://test.kesifplus.com/consulting/career"),
    INFORMATION_TECH(2,"https://test.kesifplus.com/consulting/IT")
    ;


    int index;
    String url;


    SERVICES(int index, String url) {
        this.index = index;
        this.url = url;

    }

    public void klickeAufService(){
        commonPage.getConsultingPage().clickAufServices(this.index);
        ReusableMethods.waitFor(2);
    }

    public void verifiziereUrl(){
        Assert.assertEquals(this.url, driver.getCurrentUrl());
        ReusableMethods.waitFor(2);

    }

}
