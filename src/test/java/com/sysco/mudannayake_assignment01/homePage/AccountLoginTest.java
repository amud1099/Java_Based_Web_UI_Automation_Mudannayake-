package com.sysco.mudannayake_assignment01.homePage;

import com.sysco.mudannayake_assignment01.functions.BirthDayValidation.BirthDayValidation;
import com.sysco.mudannayake_assignment01.functions.homePage.AccountLogin;
import com.sysco.mudannayake_assignment01.functions.loadBundabergrumPage.Login;
import com.sysco.mudannayake_assignment01.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.UnsupportedEncodingException;

public class AccountLoginTest extends TestBase {


    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Bundabergrum - AccountLogin");
        Login.loadPage();
        BirthDayValidation.clickDayDropDown();
        BirthDayValidation.clickMonthDropDown();
        BirthDayValidation.clickYearDropDownForGreaterThan18();
        BirthDayValidation.clickEnter();
    }

    @Test(priority = 1, alwaysRun = true)
    public static void testMyAccountLink() {
        AccountLogin.clickMyAccountLink();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(AccountLogin.isDisplayedLoginButton(),"Expected link does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 2, alwaysRun = true)
    public static void testUserCannotLoginUsingInvalidUsernameAndAValidPassword() throws UnsupportedEncodingException {
        AccountLogin.loginToBundabergrumByInvalidUserName();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AccountLogin.isDisplayedEmailValidation(),"Please enter a valid email address. For example johndoe@domain.com.","Expected validation does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 3, alwaysRun = true)
    public static void testUserCannotLoginUsingValidUsernameAndAnInvalidPassword() throws UnsupportedEncodingException {
        AccountLogin.loginToBundabergrumByInvalidPassword();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AccountLogin.isDisplayedPasswordValidation(),"Please enter 6 or more characters. Leading or trailing spaces will be ignored.","Expected validation does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 4, alwaysRun = true)
    public static void testUserCannotLoginUsingInvalidUsernameAndAnInvalidPassword() throws UnsupportedEncodingException {
        AccountLogin.loginToBundabergrumByInvalidUsernameAndInvalidPassword();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AccountLogin.isDisplayedEmailValidation(),"Please enter a valid email address. For example johndoe@domain.com.","Expected validation does not displayed");
        softAssert.assertEquals(AccountLogin.isDisplayedPasswordValidation(),"Please enter 6 or more characters. Leading or trailing spaces will be ignored.","Expected validation does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 5, alwaysRun = true)
    public static void testUserCannotLoginUsingInBlankUsername() throws UnsupportedEncodingException {
        AccountLogin.loginToBundabergrumByBlankUsername();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AccountLogin.isDisplayedBlankEmailValidation(),"This is a required field.","Expected validation does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 6, alwaysRun = true)
    public static void testUserCannotLoginUsingInBlankPassword() throws UnsupportedEncodingException {
        AccountLogin.loginToBundabergrumByBlankPassword();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AccountLogin.isDisplayedBlankPasswordValidation(),"This is a required field.","Expected validation does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 7, alwaysRun = true)
    public static void testCaseSensitivityOfEmail() throws UnsupportedEncodingException {
        AccountLogin.enterCaseSensitiveUserName();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AccountLogin.isDisplayedEmailValidation(),"Please enter a valid email address. For example johndoe@domain.com.","Expected validation does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 8, alwaysRun = true)
    public static void testForgotPasswordLink()  {
        AccountLogin.clickForgotPasswordLink();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AccountLogin.isDisplayedForgotPasswordPage(),"FORGOT YOUR PASSWORD?","Expected name does not displayed");
        AccountLogin.enterEmailInForgotPassword();
        AccountLogin.clickSubmitButton();
        softAssert.assertEquals(AccountLogin.isDisplayedEmailSendingMessage(),"If there is an account associated with williamjacob802@gmail.com you will receive an email with a link to reset your password.","Expected link does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 9, alwaysRun = true)
    public static void testUserCanLoginUsingValidUsernameAndValidPassword() throws UnsupportedEncodingException {
        AccountLogin.loginToBundabergrumByValidUsernameAndValidPassword();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(AccountLogin.isDisplayedHomePageTitle(),"MY BUNDY ACCOUNT","Expected value does not displayed");
        softAssert.assertEquals(AccountLogin.isDisplayedLoggedUsername(),"HELLO, WILLIAM JACOB!","Expected username does not displayed");
        softAssert.assertAll();
    }










    @AfterClass
    public void closeDriver() {
        Login.quiteDriver();
    }
}
