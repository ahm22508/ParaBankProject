package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
        WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    private final By UserNameField = By.name("username");
    private final By PasswordField = By.name("password");
    private final By LoginButton = By.xpath("//input[@value ='Log In']");
    private  final By Register = By.xpath("//a[text()='Register']");

    public static By AssertErrorLogin(){
        return By.xpath("//h1[text()='Error!']");
    }

    public RegisterPage GoToRegisterPage(){
        driver.findElement(Register).click();
        return new RegisterPage(driver);
    }

    public void Login(String UserName, String Password){
        driver.findElement(UserNameField).sendKeys(UserName);
        driver.findElement(PasswordField).sendKeys(Password);
        driver.findElement(LoginButton).click();
    }

}
