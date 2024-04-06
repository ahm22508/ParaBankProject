package ParaBankTests;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;


public class Base {
    public WebDriver driver;
    @BeforeMethod
    public void StartDriver(){
        driver =  new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }
    @AfterMethod
    public void EndDriver(){
        driver.quit();
    }
}
