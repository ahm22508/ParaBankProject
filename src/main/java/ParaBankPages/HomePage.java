package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public static By AssertRegisterorLoginCorrect(){
        return By.xpath("//a[text()='Open New Account']");
    }



}

