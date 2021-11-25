package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends TestBase{
    HomePage homePage;
    RegisterPage registerPage;

    @Test
    public void validatePatientRegister(){
        homePage=new HomePage(driver);
        registerPage=new RegisterPage(driver);
        homePage.clickApps("Register a patient");
        registerPage.registerPatient("David","Hunt","Male","15","June"
        ,"1997","2200 E Devon","2254443322","Doctor","Kushal");
    }
}
