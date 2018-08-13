package com.sysco.mudannayake_assignment01.birthDayValidation;

import com.sysco.mudannayake_assignment01.functions.BirthDayValidation.BirthDayValidation;
import com.sysco.mudannayake_assignment01.functions.loadBundabergrumPage.Login;
import com.sysco.mudannayake_assignment01.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BirthDayValidationTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
       iTestContext.setAttribute("feature", "Bundabergrum - Checkout");
        Login.loadPage();
    }

    @Test(priority = 1, alwaysRun = true)
    public static void testTheValidationMessageDisplaysWhenkeepTheDayFieldEmpty() {
        BirthDayValidation.clickEnter();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(BirthDayValidation.isDisplayedValidationWhenKeepsAllTheFieldEmpty(),"Please enter your date of birth","Expected validation message does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 2, alwaysRun = true)
    public static void testTheValidationMessageDisplaysWhenSelectADateLessThan18() {
        BirthDayValidation.clickDayDropDown();
        BirthDayValidation.clickMonthDropDown();
        //Since this sites' year limit from 1994 I got the boundary values considering 1994 year.
        BirthDayValidation.clickYearDropDownForLessThan18();
        BirthDayValidation.clickEnter();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(BirthDayValidation.isDisplayedValidationForLessThan18(),"Sorry, your age or location does not permit you to enter at this time.","Expected validation message does not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 3, alwaysRun = true)
    public static void testTheValidationMessageDisplaysWhenSelectADateGreaterThan18() {
        BirthDayValidation.clickYearDropDownForGreaterThan18();
        BirthDayValidation.clickEnter();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(BirthDayValidation.isDisplayedMyAccountLink(),"My Account","Expected link does not displayed");
        softAssert.assertAll();
    }

    @AfterClass
    public void closeDriver() {
        Login.quiteDriver();
    }
}

