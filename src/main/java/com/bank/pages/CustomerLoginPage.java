package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourName;

    public void selectyourName (String yourNameText) {
        Reporter.log("Selecting Your Name"+yourNameText +" from dropdown "+yourName.toString() + "<br>");
        selectByVisibleTextFromDropDown(yourName,yourNameText);
    }

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login;

    public void ClickOnlogin(){
        Reporter.log("Clicking on Login"+ login.toString()+ "<br>");
        clickOnElement(login);
    }
}
