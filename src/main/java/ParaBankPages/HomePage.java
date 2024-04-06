package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private final By TransferFunds = By.xpath("//a[text()='Transfer Funds']");
    private final By BillPay = By.xpath("//a[text()='Bill Pay']");
    public static By OpenNewAccount(){
        return By.xpath("//a[text()='Open New Account']");
    }

    public NewAccountPage ClicKOnOpenNewAccount(){
        driver.findElement(HomePage.OpenNewAccount()).click();
    return new NewAccountPage(driver);
    }
    public  TransferPage ClickOnTransferFunds(){
        driver.findElement(TransferFunds).click();
     return new TransferPage(driver);
    }

    public BillPayPage ClickOnBillPay(){
        driver.findElement(BillPay).click();
     return new BillPayPage(driver);
    }



}

