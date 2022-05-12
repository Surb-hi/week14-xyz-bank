package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement deposit;

    public void ClickOnDeposit (){
        Reporter.log("Clicking on Deposit "+ deposit.toString()+ "<br>");
        clickOnElement(deposit);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterdepositamount;

    public void setTextEnterDepositAmount(String amount){
        Reporter.log("Enter deposit amount "+ amount+ " to  field "+ enterdepositamount.toString() + "<br>");
        sendTextToElement(enterdepositamount,amount);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositbutton;

    public void ClickOnDepositbutton (){
        Reporter.log("Clicking on deposit button"+ depositbutton.toString()+ "<br>");
        clickOnElement(depositbutton);
    }
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement getDepositMsg;

    public String VerifyGetDepositMSg() {
        Reporter.log("getting  text from Get Deposit MSg "+getDepositMsg.toString()+"<br>");
        return getTextFromElement(getDepositMsg);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdrawl;

    public void ClickOnWithdrawl(){
        Reporter.log("Clicking on withdrawl"+ withdrawl.toString()+ "<br>");
        clickOnElement(withdrawl);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterwithdrawlamount;

    public void setTextEnterwithdrawlAmount(String amount1){
        Reporter.log("Enter withdrawl amount "+ amount1+ " to  field "+ enterwithdrawlamount.toString() + "<br>");
        sendTextToElement(enterwithdrawlamount,amount1);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrawlbutton;

    public void ClickOnwithdrawlbutton (){
        Reporter.log("Clicking on withdrawl button"+ withdrawlbutton.toString()+ "<br>");
        clickOnElement(withdrawlbutton);
    }
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement getwithdrawlMsg;

    public String VerifyGetwithdrawlMSg() {
        Reporter.log("getting  text from Get withdrawl MSg "+getwithdrawlMsg.toString()+"<br>");
        return getTextFromElement(getwithdrawlMsg);
    }







    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logout;

    public void ClickOnLogOut(){
        Reporter.log("Clicking on Logout"+logout.toString()+ "<br>");
        clickOnElement(logout);
    }

    public String Verifylogout() {
        Reporter.log("getting  text from logout "+logout.toString()+"<br>");
        return getTextFromElement(logout);
    }

    @FindBy(xpath = "//strong/span[@class='fontBig ng-binding']")
    WebElement name;

    public String VerifyName() {
        Reporter.log("getting  text from Name "+name.toString()+"<br>");
        return getTextFromElement(name);
    }


}
