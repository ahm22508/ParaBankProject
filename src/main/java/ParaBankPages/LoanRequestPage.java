package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoanRequestPage {
    private final WebDriver driver;
    public LoanRequestPage(WebDriver driver){
        this.driver = driver;
    }
    private final By AmountField = By.id("amount");
    private final By AmountDownField = By.id("downPayment");
    private final By IDAccountField = By.xpath("//option[text()='20004']");
    private final By ApplyButton = By.xpath("//input[@value='Apply Now']");

    public void RequestLoan(String Amount, String AmountDown){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(AmountField).sendKeys(Amount);
        driver.findElement(AmountDownField).sendKeys(AmountDown);
        driver.findElement(IDAccountField).click();
        driver.findElement(ApplyButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.LoanRequestApproved()));

    }
}
