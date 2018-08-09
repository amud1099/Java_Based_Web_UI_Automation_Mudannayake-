package com.sysco.mudannayake_assignment01.functions.BirthDayValidation;

import com.sysco.mudannayake_assignment01.pages.birthDayValidation.BirthDayValidationPage;

public class BirthDayValidation {

    private static BirthDayValidationPage birthDayValidationPage = new BirthDayValidationPage();

    private BirthDayValidation() {
    }


    public static void clickDayDropDown() {
        birthDayValidationPage.clickDayDropDown();
    }

    public static void clickMonthDropDown() {
        birthDayValidationPage.clickMonthDropDown();
    }

    public static void clickYearDropDownForLessThan18() {
        birthDayValidationPage.clickYearDropDownForLessThan18();
    }

    public static String isDisplayedValidationForLessThan18() {
      return   birthDayValidationPage.isDisplayedValidationForLessThan18();
    }

    public static String isDisplayedValidationWhenKeepsAllTheFieldEmpty() {
        return   birthDayValidationPage.isDisplayedValidationWhenKeepsAllTheFieldEmpty();
    }

    public static void clickEnter() {
        birthDayValidationPage.clickEnter();
    }

    public static void clickYearDropDownForGreaterThan18() {
        birthDayValidationPage.clickYearDropDownForGreaterThan18();
    }

    public static void clickYearDropDown() {
        birthDayValidationPage.clickYearDropDown();
    }

    public static String isDisplayedMyAccountLink() {
        return  birthDayValidationPage.isDisplayedMyAccountLink();
    }


}
