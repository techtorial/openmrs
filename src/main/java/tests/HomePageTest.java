package tests;

import data.BusinessData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase{
    HomePage homePage;

    @Test
    public void validateHomePageTitles(){
        homePage=new HomePage(driver);

        Assert.assertTrue(homePage.getTitle().contains("Inpatient Ward"));
        Assert.assertEquals(homePage.getApps(), BusinessData.getExceptedAppNames());
    }

}
