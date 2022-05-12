package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customer;

    public void selectCustomer(String customerText) {
        Reporter.log("Selecting Customer" + customerText + " from dropdown " + customer.toString() + "<br>");
        selectByVisibleTextFromDropDown(customer, customerText);
    }

    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;

    public void selectCurrency(String currencyText) {
        Reporter.log("Selecting Currency" + currencyText + " from dropdown " + currency.toString() + "<br>");
        selectByVisibleTextFromDropDown(currency, currencyText);
    }

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement process;

    public void ClickOnProcess() {
        Reporter.log("Clicking on Process " + process.toString() + "<br>");
        clickOnElement(process);
    }

}
