package com.bank.testsuits;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest extends TestBase {
    AccountPage accountPage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    HomePage homePage;
    OpenAccountPage openAccountPage;
    //CustomerLogOut customerLogOut;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        accountPage = new AccountPage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        homePage = new HomePage();
        openAccountPage = new OpenAccountPage();
        //customerLogOut = new CustomerLogOut();
    }

    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.ClickOnBankManagerLogin();
        bankManagerLoginPage.ClickOnAddCustomer();
        addCustomerPage.setTextFirstName("pri123");
        addCustomerPage.setTextLastName("patel");
        addCustomerPage.setTextPostCode("380005");
        addCustomerPage.ClickOnAddCustomer();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(addCustomerPage.verifyAlertText().substring(0, 27), "Customer added successfully");
        softAssert.assertAll();
        acceptAlert();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.ClickOnHomeButton();
        homePage.ClickOnBankManagerLogin();
        bankManagerLoginPage.ClickOnOpenAccount();
        openAccountPage.selectCustomer("Harry Potter");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.ClickOnProcess();
        SoftAssert softAssert = new SoftAssert();
        try {

        softAssert.assertEquals(addCustomerPage.verifyAlertText().substring(0, 29), "Account created successfully ");
        acceptAlert();}
        catch (Exception E){
         //Exception handling
        }
        softAssert.assertAll();
    }

    @Test(groups = {"smoke","regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        homePage.ClickOnHomeButton();
        homePage.ClickOnCustomerLogin();
        customerLoginPage.selectyourName("Harry Potter");
        customerLoginPage.ClickOnlogin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPage.Verifylogout(), "Logout");
        softAssert.assertAll();
        SoftAssert softAssert1 = new SoftAssert();
        softAssert.assertEquals(accountPage.VerifyName(), "Harry Potter");
        softAssert.assertAll();
        accountPage.ClickOnLogOut();
    }

    @Test(groups = {"smoke","regression"})
    public void customerShouldDepositMoneySuccessfully() {
        homePage.ClickOnHomeButton();
        homePage.ClickOnCustomerLogin();
        customerLoginPage.selectyourName("Harry Potter");
        customerLoginPage.ClickOnlogin();
        accountPage.ClickOnDeposit();
        accountPage.setTextEnterDepositAmount("100");
        accountPage.ClickOnDepositbutton();
        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertEquals(accountPage.VerifyGetDepositMSg(), "Deposit Successful");
        softAssert1.assertAll();
    }
    @Test(groups = "regression")
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.ClickOnHomeButton();
        homePage.ClickOnCustomerLogin();
        customerLoginPage.selectyourName("Harry Potter");
        customerLoginPage.ClickOnlogin();
        accountPage.ClickOnWithdrawl();
        accountPage.setTextEnterwithdrawlAmount("50");
        accountPage.ClickOnWithdrawl();
        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertEquals(accountPage.VerifyGetwithdrawlMSg(), "Transaction successful");
        softAssert1.assertAll();
    }
}
