package com.automationexercices.tests.ui;

import com.automationexercices.apis.UserManagementAPI;
import com.automationexercices.drivers.GUIDriver;
import com.automationexercices.drivers.UITest;
import com.automationexercices.pages.SignupLoginPage;
import com.automationexercices.pages.SignupPage;
import com.automationexercices.pages.components.NavigationBarComponent;
import com.automationexercices.tests.BaseTest;
import com.automationexercices.utils.TimeManager;
import com.automationexercices.utils.dataReader.JsonReader;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("Automation Exercise")
@Feature("UI User Management")
@Story("User Registration")
@Severity(SeverityLevel.CRITICAL)
@Owner("Mustafa Darwish")
@UITest
public class RegisterTest extends BaseTest {
     String timestamp = TimeManager.getSimpleTimestamp();


    //Tests
    @Description("Verify user can sign up with valid data")
    @Test
    public void validSignUpTC() {

    }

    //Tests
    @Description("Verify user can sign up with valid data")
    @Test
    public void invalidSignUpTC() {

    }




    //Configurations
    @BeforeClass
    protected void preCondition() {
        testData = new JsonReader("register-data");
    }

    @BeforeMethod
    public void setUp() {
        driver = new GUIDriver();
        new NavigationBarComponent(driver).navigate();
    }

    @AfterMethod
    public void tearDown() {
        driver.quitDriver();
    }
}
