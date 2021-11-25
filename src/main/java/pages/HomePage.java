package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h4")
    WebElement title;

    @FindBy(xpath = "//div[@id='apps']/a")
    List<WebElement> apps;

    public String getTitle(){
        return title.getText().trim();
    }

    public List<String> getApps(){
        List<String> appNames=new ArrayList<>();
        for(WebElement app: apps){
            appNames.add(app.getText().trim());
        }
        return appNames;
    }



}
