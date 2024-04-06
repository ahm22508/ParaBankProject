package ParaBankTests;

import ParaBankPages.FinishPage;
import ParaBankPages.LoginPage;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TranferFundsTest extends Base{

    String Money = "50000";
    @Test
    public void TranferFunds(){
        new LoginPage(driver).Login(RegisterAndLoginTests.UserName, RegisterAndLoginTests.Password).ClickOwnTransferFunds().TranferFunds(Money);
        Assert.assertTrue(driver.findElement(FinishPage.TransferComplete()).isDisplayed());
    }
}
