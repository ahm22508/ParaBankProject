package ParaBankTests;

import ParaBankPages.FinishPage;
import ParaBankPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PillPayTest extends Base{
    String Name ="Ahmed";
    String Address ="Shoubra";
    String City = "Cairo";
    String State = "Shoubra";
    String ZipCode ="55690";
    String Phone ="01550810058";
    String Account = "493449";
    String VerifyAccount ="493449";
    String Amount ="500";

    @Test
    public void PillBills(){
        new LoginPage(driver).Login(RegisterAndLoginTests.UserName, RegisterAndLoginTests.Password).ClickOnBillPay().BillPay(Name,Address, City, State, ZipCode, Phone, Account, VerifyAccount,Amount);
        Assert.assertTrue(driver.findElement(FinishPage.PillPayComplete()).isDisplayed());
    }
}
