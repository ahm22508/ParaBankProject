package ParaBankTests;

import ParaBankPages.HomePage;
import ParaBankPages.LoginPage;
import ParaBankPages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterAndLoginTests extends Base {
    String FirstName = "Ahmed";
    String LastName = "Amr";
    String Address = "Shoubra";
    String City = "Cairo";
    String State = "Shoubra";
    String ZipCode = "58458" ;
    String PhoneNumber  ="01554863523";
    String SSN = "29224";
    static String UserName= "aamrfou";
    static String Password = "aamrfou55";
    String ConfirmPassword= "aamrfou55";
    String InvalidUserName = "aamrf";
    String InvalidPassword = "aamrfou";
    @Test
    public void ValidRegister(){
        new LoginPage(driver).GoToRegisterPage().RegisterToSite(FirstName, LastName, Address, City, State, ZipCode, PhoneNumber, SSN, UserName, Password, ConfirmPassword);
        Assert.assertTrue(driver.findElement(HomePage.OpenNewAccount()).isDisplayed());
    }
@Test
    public void inValidRegister(){
        new RegisterPage(driver).
                RegisterToSite(FirstName, LastName, Address, City, State, ZipCode, PhoneNumber, SSN, UserName, Password, ConfirmPassword);
        Assert.assertTrue(driver.findElement(RegisterPage.AssertErrorRegister()).isDisplayed());
    }
    @Test
    public void ValidLogin(){
        new LoginPage(driver).Login(UserName,Password);
        Assert.assertTrue(driver.findElement(HomePage.OpenNewAccount()).isDisplayed());
    }
    @Test
    public void InvalidLogin(){
        new LoginPage(driver).Login(InvalidUserName,InvalidPassword);
        Assert.assertTrue(driver.findElement(LoginPage.AssertErrorLogin()).isDisplayed());
    }


}
