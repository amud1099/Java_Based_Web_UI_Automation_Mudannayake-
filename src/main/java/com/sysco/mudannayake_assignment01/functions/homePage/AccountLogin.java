package com.sysco.mudannayake_assignment01.functions.homePage;

import com.sysco.mudannayake_assignment01.common.Constants;
import com.sysco.mudannayake_assignment01.common.EncryptData;
import com.sysco.mudannayake_assignment01.pages.homePage.AccountLoginPage;

import java.io.UnsupportedEncodingException;

public class AccountLogin {

    private static AccountLoginPage accountLoginPage = new AccountLoginPage();

    private AccountLogin() {
    }

    public static void clickMyAccountLink() {
        accountLoginPage.clickMyAccountLink();
    }

    public static boolean isDisplayedLoginButton() {
       return  accountLoginPage.isDisplayedLoginButton();
    }

    public static void loginToBundabergrumByInvalidUserName() throws UnsupportedEncodingException {
        accountLoginPage.enterEmail(Constants.EMAIL +"S3");
        accountLoginPage.enterPassword(EncryptData.decrypt(Constants.PASSWORD));
        accountLoginPage.clickLoginButton();
    }

    public static void loginToBundabergrumByInvalidPassword() throws UnsupportedEncodingException {
        accountLoginPage.enterEmail(Constants.EMAIL );
        accountLoginPage.enterPassword(EncryptData.decrypt(Constants.PASSWORD)+"S3");
        accountLoginPage.clickLoginButton();
    }

    public static void loginToBundabergrumByInvalidUsernameAndInvalidPassword() throws UnsupportedEncodingException {
        accountLoginPage.enterEmail(Constants.EMAIL + "S3");
        accountLoginPage.enterPassword(EncryptData.decrypt(Constants.PASSWORD)+"S3");
        accountLoginPage.clickLoginButton();
    }

    public static void loginToBundabergrumByBlankUsername() throws UnsupportedEncodingException {
        accountLoginPage.enterEmail("");
        accountLoginPage.enterPassword(EncryptData.decrypt(Constants.PASSWORD));
        accountLoginPage.clickLoginButton();
    }

    public static void loginToBundabergrumByBlankPassword() throws UnsupportedEncodingException {
        accountLoginPage.enterEmail(Constants.EMAIL);
        accountLoginPage.enterPassword("");
        accountLoginPage.clickLoginButton();
    }

    public static void loginToBundabergrumByValidUsernameAndValidPassword() throws UnsupportedEncodingException {
        accountLoginPage.enterEmail(Constants.EMAIL );
        accountLoginPage.enterPassword(EncryptData.decrypt(Constants.PASSWORD));
        accountLoginPage.clickLoginButton();
    }

    public static void enterCaseSensitiveUserName() throws UnsupportedEncodingException {
        accountLoginPage.enterEmail("WilliAmjaCoB802@gmail.com");
        accountLoginPage.enterPassword(EncryptData.decrypt(Constants.PASSWORD));
        accountLoginPage.clickLoginButton();
    }


    public static void clickForgotPasswordLink() {
        accountLoginPage.clickForgotPasswordLink();
    }

    public static void clickSubmitButton() {
        accountLoginPage.clickSubmitButton();
    }

    public static void clickGoBack() {
        accountLoginPage.clickGoBack();
    }

    public static String isDisplayedEmailSendingMessage() {
        return  accountLoginPage.isDisplayedEmailSendingMessage();
    }

    public static String isDisplayedEmailValidation() {
        return  accountLoginPage.isDisplayedEmailValidation();
    }

    public static String isDisplayedBlankEmailValidation() {
        return  accountLoginPage.isDisplayedBlankEmailValidation();
    }

    public static String isDisplayedBlankPasswordValidation() {
        return  accountLoginPage.isDisplayedBlankPasswordValidation();
    }

    public static String isDisplayedForgotPasswordPage() {
        return  accountLoginPage.isDisplayedForgotPasswordPage();
    }

    public static String isDisplayedHomePageTitle() {
        return  accountLoginPage.isDisplayedHomePageTitle();
    }

    public static String isDisplayedLoggedUsername() {
        return  accountLoginPage.isDisplayedLoggedUsername();
    }

    public static String isDisplayedPasswordValidation() {
        return  accountLoginPage.isDisplayedPasswordValidation();
    }

    public static void enterEmailInForgotPassword()  {
        accountLoginPage.enterEmailInForgotPasswrd(Constants.EMAIL);}
}
