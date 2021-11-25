package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

import java.util.Set;

public class TestBase {
    public WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        driver= Driver.getDriver();

        driver.get(ConfigReader.readProperty("loginUrl"));
        loginPage=new LoginPage(driver);
        loginPage.login(ConfigReader.readProperty("username")
                ,ConfigReader.readProperty("password"),
                "Inpatient Ward");


        }
    }

