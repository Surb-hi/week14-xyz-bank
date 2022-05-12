package com.bank.testbase;

import com.bank.propertyreader.PropertyReader;
import com.bank.utility.Utility;
import org.testng.annotations.BeforeClass;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @BeforeClass(alwaysRun = true)
    public void tearDown(){
        //closeBrowser();
    }

}
