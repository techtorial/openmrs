package tests;

import data.PatientData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends TestBase{
    HomePage homePage;
    RegisterPage registerPage;

    @Test(priority = 1)
    public void validatePatientRegister(){
        homePage=new HomePage(driver);
        registerPage=new RegisterPage(driver);
        homePage.clickApps("Register a patient");
        registerPage.registerPatient("David","Hunt","Male","15","June"
        ,"1997","2200 E Devon","2254443322","Doctor","Kushal");

        Assert.assertEquals(registerPage.getName(),"David, Hunt");
        Assert.assertEquals(registerPage.getAddress(),"2200 E Devon");
    }

    @Test(priority = 2,dataProvider = "patientInfo",dataProviderClass = PatientData.class)
    public void validateMultiPatientRegister(String givenName, String familyName, String gender, String bDay, String bMonth,
                                             String bYear, String address, String phoneNumber, String relationshipType, String personName){
        homePage=new HomePage(driver);
        registerPage=new RegisterPage(driver);
        homePage.clickApps("Register a patient");
        registerPage.registerPatient(givenName, familyName,gender,bDay,bMonth,bYear,address,phoneNumber,relationshipType,personName);

        Assert.assertEquals(registerPage.getName(),givenName+", "+familyName);
        Assert.assertEquals(registerPage.getAddress(),address);
    }

}
