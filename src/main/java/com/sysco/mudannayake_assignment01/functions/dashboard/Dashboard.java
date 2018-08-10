package com.sysco.mudannayake_assignment01.functions.dashboard;

import com.sysco.mudannayake_assignment01.common.Constants;
import com.sysco.mudannayake_assignment01.pages.Dashboard.DashboardPage;


public class Dashboard {


    private static DashboardPage dashboardPage = new DashboardPage();

    private Dashboard() {
    }

    public static void clickCartIcon() {
        dashboardPage.clickCartIcon();
    }

    public static void MoveToProductCategory() {
        dashboardPage.MoveToProductCategory();
    }

    public static void clickRoyalLiqueur() {
        dashboardPage.clickRoyalLiqueur();
    }

    public static void clickAnItem() {
        dashboardPage.clickAnItem();
    }

    public static void clickAddToCartButton() {
        dashboardPage.clickAddToCartButton();
    }

    public static void clickProceedToCheckOut() {
        dashboardPage.clickProceedToCheckOut();
    }

    public static void clearFirstName() {
        dashboardPage.clearFirstName();
    }

    public static void clearLastNameName() {
        dashboardPage.clearLastNameName();
    }

    public static void clearAddress1() {
        dashboardPage.clearAddress1();
    }

    public static void clearContactNumberName() {
        dashboardPage.clearContactNumberName();
    }

    public static void clickCheckOut() {
        dashboardPage.clickCheckOut();
    }

    public static void clickContinue() {
        dashboardPage.clickContinue();
    }

    public static void removePostCode() {
        dashboardPage.removePostCode();
    }

    public static void clickRemoveLink() {
        dashboardPage.clickRemoveLink();
    }

    public static String isDisplayedZeroInCart() {
        return  dashboardPage.isDisplayedZeroInCart();
    }

    public static String isDisplayedOneInShoppingCart() {
        return  dashboardPage.isDisplayedOneInShoppingCart();
    }

    public static boolean isDisplayedPrice() {
      return dashboardPage.isDisplayedPrice();
    }

    public static boolean isDisplayedName() {
        return   dashboardPage.isDisplayedName();
    }

    public static String isDisplayedFirstName() {
        return  dashboardPage.isDisplayedFirstName();
    }

    public static String isDisplayedLastName() {
        return  dashboardPage.isDisplayedLastName();
    }

    public static String isDisplayedAddress() {
        return  dashboardPage.isDisplayedAddress();
    }

    public static String isDisplayedContactNumber() {
        return  dashboardPage.isDisplayedContactNumber();
    }

    public static boolean isDisplayedPriceInPopUp() {
        return  dashboardPage.isDisplayedPriceInPopUp();
    }

    public static boolean isDisplayedNameInPopUP() {
        return  dashboardPage.isDisplayedNameInPopUP();
    }

    public static String isDisplayedEmptyErrorFirstName() {
        return  dashboardPage.isDisplayedEmptyErrorFirstName();
    }

    public static String isDisplayedEmptyErrorLastName() {
        return  dashboardPage.isDisplayedEmptyErrorLastName();
    }

    public static String isDisplayedEmptyErrorAddress() {
        return  dashboardPage.isDisplayedEmptyErrorAddress();
    }

    public static String isDisplayedEmptyErrorContactNumber() {
        return  dashboardPage.isDisplayedEmptyErrorContactNumber();
    }

    public static void enterFirstName()  {
        dashboardPage.enterFirstName("william");
    }

    public static void enterLastName()  {
        dashboardPage.enterLastName("jacob");
    }

    public static void enterAddress1()  {
        dashboardPage.enterAddress1("Abc");
    }

    public static void enterContactNumber()  {
        dashboardPage.enterContactNumber("42342423423");

    }

    public static void enterPostCode()  {
        dashboardPage.enterPostCode("2000");
    }

    public static String isDisplayedDeliveryOptions() {
        return  dashboardPage.isDisplayedDeliveryOptions();
    }

    public static String isDisplayedPayPalAccount() {
        return  dashboardPage.isDisplayedPayPalAccount();
    }

    public static String isDisplayedValidationForInvalidCreditNumber() {
        return  dashboardPage.isDisplayedValidationForInvalidCreditNumber();
    }

    public static void clickContinueInDeliveryOptions() {
        dashboardPage.clickContinueInDeliveryOptions();
    }

    public static void selectPayPalOption() {
        dashboardPage.selectPayPalOption();
    }

    public static void selectAgreement() {
        dashboardPage.selectAgreement();
    }

    public static void clickPurchase() {
        dashboardPage.clickPurchase();

    }

    public static void enterCreditCardNumber()  {
        dashboardPage.enterCreditCardNumber("2222 2222 3333 3333");
    }

    public static void enterExpirevalue()  {
        dashboardPage.enterExpirevalue("1222");
    }

    public static void enterCVV()  {
        dashboardPage.enterCVV("112");
    }

    public static void enterPhone()  {
        dashboardPage.enterPhone("1222 222 222");
    }


    public static void clickNoThanks() {
        dashboardPage.clickNoThanks();
    }

    public static void clickPolicy() {
        dashboardPage.clickPolicy();
    }


    public static void clickContinueInPayPal() {
        dashboardPage.clickContinueInPayPal();
    }





}
