package com.sysco.mudannayake_assignment01.pages.homePage;


import com.sysco.mudannayake_assignment01.pages.loadBundabergrumPage.LoginPage;
import org.openqa.selenium.By;



public class AccountLoginPage extends LoginPage {

    private By lnkMyAccount = By.xpath("//a[@title='My Account']");
    private static By btnLogin=By.id("send2");
    private static By txtEmail=By.id("email");
    private static By txtPassword=By.id("pass");
    private static By txtEmailValidation=By.id("advice-validate-email-email");
    private static By txtPasswordValidation=By.id("advice-validate-password-pass");
    private static By txtBlankEmailValidation=By.id("advice-required-entry-email");
    private static By txtBlankPasswordValidation=By.id("advice-required-entry-pass");
    private static By txtHomePageTitle=By.xpath("//h1[.='My Bundy Account']");
    private static By txtLoggedUserName=By.xpath("//div[@class='welcome-msg']/h2[@class='sub-title']");
    private static By lnkForgotPassword=By.xpath("//*[@id=\"login-form\"]/div/div/div[1]/ul/li[4]/a");
    private static By txtForgotPassword=By.xpath("//div[2]/div[3]/div[1]/div/div/div/h1");
    private static By lnkGoBack=By.xpath("//*[@id=\"form-validate\"]/div/div/div/p/a");
    private static By txtEmailInForgotPassword=By.id("email_address");
    private static By btnSubmit=By.xpath("//*[@id=\"form-validate\"]/div/div/div/button");
    private static By txtEmailSendMessage=By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/ul/li/ul/li/span");
    private static By txtInvalidPasswordValidation=By.xpath("//div[3]//ul[@class='messages']/li/ul/li");

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

    public String isDisplayedInvalidPasswordValidation() {
        return syscoLabUIOgm.getText(txtInvalidPasswordValidation);
    }



}
