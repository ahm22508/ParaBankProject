package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferPage {
   private final WebDriver driver;
    public TransferPage(WebDriver driver){
        this.driver = driver;
    }
    private final By Amount = By.id("amount");
    private final By TransferButton = By.xpath("//input[@type='submit']");
    private final By IdAccount = By.xpath("//option[text()='14454']");


    public void TransferFunds(String Money){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeSelected(IdAccount));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Amount));
        driver.findElement(Amount).sendKeys(Money);
        wait.until(ExpectedConditions.visibilityOfElementLocated(TransferButton));
        driver.findElement(TransferButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.TransferComplete()));

    }
}
