package ParaBankPages;

import org.openqa.selenium.By;

public class FinishPage {

    public static By GetAccountOpened(){
      return By.xpath("//h1[text()= 'Account Opened!']");
    }
    public static By TransferComplete() {
      return   By.xpath("//h1[text()='Transfer Complete!']");
    }

}
