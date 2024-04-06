package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class NewAccountPage {
    private final WebDriver driver;
    public NewAccountPage(WebDriver driver){
        this.driver = driver;
    }
    private final By OpenNewAccountButton = By.xpath("//input[@type='submit']");
    private final By SavingSelection = By.xpath("//option[text()='SAVINGS']");
    private final By IdAccount = By.xpath("//option[text()='20004']");

    public void OpenNewAccount(){
        driver.findElement(SavingSelection).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(IdAccount));
        driver.findElement(OpenNewAccountButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FinishPage.GetAccountOpened()));
    }
}
