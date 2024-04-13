package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferPage {
   private final WebDriver driver;
    public TransferPage(WebDriver driver){
        this.driver = driver;
    }
    private final By Amount = By.id("amount");
    private final By TransferButton = By.xpath("//input[@type='submit']");
    private final By IdAccount = By.id("fromAccountId");
    private final By ToIdAccount = By.id("toAccountId");


    public void TransferFunds(String Money){
        Select select = new Select(driver.findElement(IdAccount));
        Select select1 = new Select(driver.findElement(ToIdAccount));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(IdAccount));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Amount));
        driver.findElement(Amount).sendKeys(Money);
        select.selectByIndex(2);
        select1.selectByValue("21003");
        wait.until(ExpectedConditions.visibilityOfElementLocated(TransferButton));
        driver.findElement(TransferButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.TransferComplete()));

    }
}
