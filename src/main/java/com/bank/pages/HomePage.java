package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    public void ClickOnCustomerLogin() {
        Reporter.log("Clicking on customer Login " + customerLogin.toString() + "<br>");
        clickOnElement(customerLogin);
    }


    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;

    public void ClickOnBankManagerLogin() {
        Reporter.log("Clicking on bankManager Login" + bankManagerLogin.toString() + "<br>");
        clickOnElement(bankManagerLogin);
    }

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeButton;

    public void ClickOnHomeButton() {
        Reporter.log("Clicking on home Button" + homeButton.toString() + "<br>");
        clickOnElement(homeButton);

    }
}