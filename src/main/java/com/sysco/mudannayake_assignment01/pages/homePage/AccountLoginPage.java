package com.sysco.mudannayake_assignment01.pages.homePage;


import com.sysco.mudannayake_assignment01.pages.loadBundabergrumPage.LoginPage;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class AccountLoginPage extends LoginPage {

    private By lnkMyAccount = xpath("//a[@title='My Account']");
    private static By btnLogin=id("send2");
    private static By txtEmail=id("email");
    private static By txtPassword=id("pass");
    private static By txtEmailValidation=id("advice-validate-email-email");
    private static By txtPasswordValidation=id("advice-validate-password-pass");
    private static By txtBlankEmailValidation=id("advice-required-entry-email");
    private static By txtBlankPasswordValidation=id("advice-required-entry-pass");
    private static By txtHomePageTitle=xpath("//h1[.='My Bundy Account']");
    private static By txtLoggedUserName=xpath("//div[@class='welcome-msg']/h2[@class='sub-title']");
    private static By lnkForgotPassword=xpath("//*[@id=\"login-form\"]/div/div/div[1]/ul/li[4]/a");
    private static By txtForgotPassword=xpath("//div[2]/div[3]/div[1]/div/div/div/h1");
    private static By lnkGoBack=xpath("//*[@id=\"form-validate\"]/div/div/div/p/a");
    private static By txtEmailInForgotPassword=id("email_address");
    private static By btnSubmit=xpath("//*[@id=\"form-validate\"]/div/div/div/button");
    private static By txtEmailSendMessage=xpath("/html/body/div[3]/div[3]/div[2]/div/div/ul/li/ul/li/span");

    public void clickMyAccountLink() {
        syscoLabUIOgm.click(lnkMyAccount);
        syscoLabUIOgm.sleep(1);
    }

    public boolean isDisplayedLoginButton() {
     return syscoLabUIOgm.isDisplayed(btnLogin);
    }

    public void enterEmail(String username) {
        syscoLabUIOgm.sendKeys(txtEmail, username);
    }

    public void enterPassword(String password) {
        syscoLabUIOgm.sendKeys(txtPassword,password);
    }

    public void enterEmailInForgotPasswrd(String email_address) {
        syscoLabUIOgm.sendKeys(txtEmailInForgotPassword,email_address);
    }


    public void clickLoginButton() {
        syscoLabUIOgm.click(btnLogin);
        syscoLabUIOgm.sleep(3);
    }

    public void clickForgotPasswordLink() {
        syscoLabUIOgm.click(lnkForgotPassword);
        syscoLabUIOgm.sleep(2);
    }

    public void clickSubmitButton() {
        syscoLabUIOgm.click(btnSubmit);
        syscoLabUIOgm.sleep(2);
    }

    public void clickGoBack() {
        syscoLabUIOgm.click(lnkGoBack);
        syscoLabUIOgm.sleep(2);
    }

    public String isDisplayedEmailValidation() {
        return syscoLabUIOgm.getText(txtEmailValidation);
    }

    public String isDisplayedBlankEmailValidation() {
        return syscoLabUIOgm.getText(txtBlankEmailValidation);
    }

    public String isDisplayedBlankPasswordValidation() {
        return syscoLabUIOgm.getText(txtBlankPasswordValidation);
    }

    public String isDisplayedForgotPasswordPage() {
        return syscoLabUIOgm.getText(txtForgotPassword);
    }

    public String isDisplayedEmailSendingMessage() {
        syscoLabUIOgm.sleep(2);
        return (syscoLabUIOgm.getText(txtEmailSendMessage));
    }

    public String isDisplayedHomePageTitle() {
        return syscoLabUIOgm.getText(txtHomePageTitle);
    }

    public String isDisplayedLoggedUsername() {
        return syscoLabUIOgm.getText(txtLoggedUserName);
    }

    public String isDisplayedPasswordValidation() {
        return syscoLabUIOgm.getText(txtPasswordValidation);
    }



}
