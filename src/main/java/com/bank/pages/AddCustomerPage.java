package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstName;

    public void setTextFirstName(String firstNameText) {
        Reporter.log("Enter FirstName " + firstNameText + " to firstName  field " + firstName.toString() + "<br>");
        sendTextToElement(firstName,firstNameText);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastName;

    public void setTextLastName(String lastNameText) {
        Reporter.log("Enter LastName" + lastNameText + " to LastName  field " + lastName.toString() + "<br>");
        sendTextToElement(lastName,lastNameText);
    }


    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement PostCode;

    public void setTextPostCode(String postcodeText) {
        Reporter.log("Enter  Post Code" + postcodeText + " to Post Code field " + PostCode.toString() + "<br>");
        sendTextToElement(PostCode,postcodeText);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomer;

    public void ClickOnAddCustomer() {
        Reporter.log("Clicking on AddCustomer" + addCustomer.toString() + "<br>");
        clickOnElement(addCustomer);
    }

    public String verifyAlertText(){
        //Reporter.log("getting  text from alert"+.toString()+"<br>");
        return getTextFromAlert();
    }
}
