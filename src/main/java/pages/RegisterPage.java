package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class RegisterPage {

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "givenName")
    WebElement givenName;

    @FindBy(name = "familyName")
    WebElement familyName;

    @FindBy(id="next-button")
    WebElement nextButton;

    @FindBy(id="gender-field")
    WebElement gender;

    @FindBy(name="birthdateDay")
    WebElement bDay;

    @FindBy(name = "birthdateMonth")
    WebElement bMonth;

    @FindBy(xpath = "//label[contains(.,'Year ')]/following-sibling::input")
    WebElement bYear;

    @FindBy(id="address1")
    WebElement address;

    @FindBy(name = "phoneNumber")
    WebElement phoneNumber;

    @FindBy(name = "relationship_type")
    WebElement relationshipType;

    @FindBy(xpath = "//input[@placeholder='Person Name']")
    WebElement personName;

    public void registerPatient(String givenName, String familyName, String gender, String bDay, String bMonth,
                                String bYear, String address, String phoneNumber, String relationshipType, String personName ){
        this.givenName.sendKeys(givenName);
        this.familyName.sendKeys(familyName);
        nextButton.click();
        BrowserUtils.selectBy(this.gender,gender, "text");
        nextButton.click();
        this.bDay.sendKeys(bDay);
        BrowserUtils.selectBy(this.bMonth,bMonth,"text");
        this.bYear.sendKeys(bYear);
        nextButton.click();
        this.address.sendKeys(address);
        nextButton.click();
        this.phoneNumber.sendKeys(phoneNumber);
        nextButton.click();
       BrowserUtils.selectBy(this.relationshipType, relationshipType, "text");
        this.personName.sendKeys(personName);
        nextButton.click();

    }
}
