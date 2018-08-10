package com.sysco.mudannayake_assignment01.dashboard;

import com.sysco.mudannayake_assignment01.functions.BirthDayValidation.BirthDayValidation;
import com.sysco.mudannayake_assignment01.functions.dashboard.Dashboard;
import com.sysco.mudannayake_assignment01.functions.homePage.AccountLogin;
import com.sysco.mudannayake_assignment01.functions.loadBundabergrumPage.Login;
import com.sysco.mudannayake_assignment01.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.UnsupportedEncodingException;

public class DashboardTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext)throws UnsupportedEncodingException {
        iTestContext.setAttribute("feature", "Bundabergrum - Dashboard");
        Login.loadPage();
        BirthDayValidation.clickDayDropDown();
        BirthDayValidation.clickMonthDropDown();
        BirthDayValidation.clickYearDropDown();
        BirthDayValidation.clickEnter();
        AccountLogin.clickMyAccountLink();
        AccountLogin.loginToBundabergrumByValidUsernameAndValidPassword();
    }

    @Test(priority = 1, alwaysRun = true)
    public static void testRemovingItemsFromCart() {
        Dashboard.clickRemoveLink();
        SoftAssert softAssert=new SoftAssert();
        Dashboard.clickCartIcon();
        softAssert.assertEquals(Dashboard.isDisplayedZeroInCart(),"0","Expected value does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 2, alwaysRun = true)
    public static void testAddingAnItemToCart() {
        Dashboard.MoveToProductCategory();
        Dashboard.clickRoyalLiqueur();
        Dashboard.clickAnItem();
        Dashboard.clickAddToCartButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Dashboard.isDisplayedPriceInPopUp(), "expected price does not displayed");
        softAssert.assertTrue(Dashboard.isDisplayedNameInPopUP(), "expected name does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 3, alwaysRun = true)
    public static void testCheckOutOfAnItem() {
        Dashboard.clickCheckOut();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Dashboard.isDisplayedOneInShoppingCart(), "1", "Expected value does not displayed");
        softAssert.assertTrue(Dashboard.isDisplayedPrice(), "expected price does not displayed");
        softAssert.assertTrue(Dashboard.isDisplayedName(), "expected name does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 4, alwaysRun = true)
    public static void testValidationsDisplayWhenClickContinueInProceedToCheckOut() {
        Dashboard.clickProceedToCheckOut();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Dashboard.isDisplayedFirstName(),"william","expected name does not displayed");
        softAssert.assertEquals(Dashboard.isDisplayedLastName(),"jacob","expected name does not displayed");
        Dashboard.clearFirstName();
        Dashboard.clearLastNameName();
        Dashboard.clearAddress1();
        Dashboard.clearContactNumberName();
        Dashboard.clickContinue();
        softAssert.assertEquals(Dashboard.isDisplayedEmptyErrorFirstName(),"This is a required field.","expected value does not displayed");
        softAssert.assertEquals(Dashboard.isDisplayedEmptyErrorLastName(),"This is a required field.","expected value does not displayed");
        softAssert.assertEquals(Dashboard.isDisplayedEmptyErrorAddress(),"This is a required field.","expected value does not displayed");
        softAssert.assertEquals(Dashboard.isDisplayedEmptyErrorContactNumber(),"This is a required field.","expected value does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 5, alwaysRun = true)
    public static void testContinueInProceedToCheckOutOfAnItem() {
        Dashboard.enterFirstName();
        Dashboard.enterLastName();
        Dashboard.enterAddress1();
        Dashboard.enterContactNumber();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(Dashboard.isDisplayedFirstName(),"william","expected name does not displayed");
        softAssert.assertEquals(Dashboard.isDisplayedLastName(),"jacob","expected name does not displayed");
        softAssert.assertEquals(Dashboard.isDisplayedAddress(),"Abc","expected name does not displayed");
        softAssert.assertEquals(Dashboard.isDisplayedContactNumber(),"42342423423","expected name does not displayed");
        Dashboard.removePostCode();
        Dashboard.enterPostCode();
        Dashboard.clickContinue();
        softAssert.assertEquals(Dashboard.isDisplayedDeliveryOptions(),"DELIVERY OPTIONS","expected name does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 6, alwaysRun = true)
    public static void testDeliveryOptions() {
        Dashboard.clickContinueInDeliveryOptions();
        Dashboard.selectPayPalOption();
        Dashboard.selectAgreement();
        Dashboard.clickPurchase();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Dashboard.isDisplayedPayPalAccount(),"PayPal Guest Checkout","expected name does not displayed");

        softAssert.assertAll();
    }

    @Test(priority = 7, alwaysRun = true)
    public static void testEnteringPayPalDetails() {
        Dashboard.enterCreditCardNumber();
        Dashboard.enterExpirevalue();
        Dashboard.enterCVV();
        Dashboard.enterPhone();
        Dashboard.clickNoThanks();
        Dashboard.clickPolicy();
        Dashboard.clickContinueInPayPal();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(Dashboard.isDisplayedValidationForInvalidCreditNumber(),"We can't verify your address","Expected validation does not displayed");
        softAssert.assertAll();
    }





    @AfterClass
    public void closeDriver() {
        Login.quiteDriver();
    }
}



