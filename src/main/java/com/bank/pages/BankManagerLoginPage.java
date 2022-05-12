package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    public BankManagerLoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;

    public void ClickOnAddCustomer (){
        Reporter.log("Clicking on AddCustomer"+ addCustomer.toString()+ "<br>");
        clickOnElement(addCustomer);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccount;

    public void ClickOnOpenAccount (){
        Reporter.log("Clicking on OpenAccount "+ openAccount.toString()+ "<br>");
        clickOnElement(openAccount);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customers;

    public void ClickOnCustomers(){
        Reporter.log("Clicking on Customers "+ customers.toString()+ "<br>");
        clickOnElement(customers);
    }
}
