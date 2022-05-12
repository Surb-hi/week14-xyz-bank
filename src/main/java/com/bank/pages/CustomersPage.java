package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    public CustomersPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")
    WebElement serchCustomer;

    public void setTextserchCustomer(String serchCustomerText){
        Reporter.log("Enter serchCustomer "+serchCustomerText + " to serchCustomer  field "+ serchCustomer.toString() + "<br>");
        sendTextToElement(serchCustomer);
    }
}
