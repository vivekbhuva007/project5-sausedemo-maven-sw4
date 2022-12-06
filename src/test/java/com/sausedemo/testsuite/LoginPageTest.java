package com.sausedemo.testsuite;

import com.sausedemo.pages.LoginPage;
import com.sausedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()  {
        // login with valid username
        loginPage.emailId("standard_user");

        //valid password
        loginPage.password("secret_sauce");

        // click on login button
        loginPage.loginButton();


        // Verify Products are displayed
        String expectedText = "PRODUCTS";
        String actualText = loginPage.verifyMessage();
        Assert.assertEquals(actualText,expectedText,"Login page not displayed");

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){

        // login with valid username
        loginPage.emailId("standard_user");
        //valid password
        loginPage.password("secret_sauce");

        // click on login button
        loginPage.loginButton();

        // verify six products are displayed or not
        loginPage.inventoryDisplay();


    }




    }
