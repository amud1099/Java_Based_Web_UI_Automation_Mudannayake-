package com.sysco.mudannayake_assignment01.pages.Dashboard;

import com.sysco.mudannayake_assignment01.pages.loadBundabergrumPage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;


public class DashboardPage extends LoginPage {

    private static By icnCart =id("cartHeader");
    private static By lnkRemove =xpath("//a[@title='Remove']");
    private static By icnCartZeroValue =xpath("//*[@id=\"quick-access-list\"]/li[2]/ul/li[3]/div/div[1]/span[2]");
    private static By lnkProductCategory =xpath("//div[@id='nav-wrapper']/div/ul[1]/li[@class='link-product']");
    private static By lnkBottleShop =xpath("//div[4]/div[1]/div[1]/ul/li/a");
    private static By icnItem =xpath("//a[@id='main-image']/img[@alt='Royal Liqueur - Mixed Pack 4']");
    private static By btnAddToCart =xpath("//*[@id=\"bundleSummary\"]/div/div[3]/button");
    private static By btnCheckOut =xpath("//*[@id=\"topCartContent\"]/div/div/div/button");
    private static By icnCartValue =xpath("//li[2]/ul/li[3]/div/div[1]/span[2]");
    private static By txtPrice =xpath("//h1/span/span[@class='price']");
    private static By txtName =xpath("//h2/a[@href='https://www.bundabergrum.com.au/royal-liqueur-mixed-pack-4']");
    private static By txtPriceInPopUp =xpath("//ol[@id='mini-cart']/li[@class='item odd']//table//span[@class='price']");
    private static By txtNameInPopUp =xpath("//ol[@id='mini-cart']//p[@class='product-name']/a[@href='https://www.bundabergrum.com.au/royal-liqueur-mixed-pack-4']");
    private static By btnProceedToCheckOut =xpath("//div[@class='payment-types']/ul[@class='checkout-types']//button[@title='Proceed to Checkout']//span[@class='mobile-hide']");
    private static By btnContinue =id("delivery-address-button");
    private static By txtEmptyEmailValidation =id("advice-required-entry-login-email-guest");
    private static By txtCheckOut =xpath("//h1[.='Checkout']");
    private static By txtEmail =id("login-email");
    private static By btnAccount =xpath("//dl[@id='collateral-tabs']//span[@class='tab2Class']");
    private static By txtPassword =id("login-password");
    private static By txtFirstName =id("billing:firstname");
    private static By txtLastName =id("billing:lastname");
    private static By txtAddress =id("billing:street1");
    private static By txtContactNumber =id("billing:telephone");
    private static By lnkRoyalLiqueur =xpath("//div[4]/div[@class='megamenu-left']/div[1]/ul//ul[@class='level0']//a[@href='https://www.bundabergrum.com.au/all-bottles/royal-liqueur-flavoured']");
    private static By txtValidationForEmptyFirstName =id("advice-required-entry-billing:firstname");
    private static By txtValidationForEmptyLastName =id("advice-required-entry-billing:lastname");
    private static By txtValidationForEmptyAddress =id("advice-required-entry-billing:street1");
    private static By txtValidationForEmptyContactNumber =id("advice-required-entry-billing:telephone");
    private static By icnRemovePostCode =id("billing:postcodesuburbremove");
    private static By txtPostCode =id("billing:postcodesuburb");
    private static By txtDeliveryOptions =xpath("//h2[.='Delivery Options']");
    private static By btnContinueInDeliveryOptions =id("shipping-method-button");
    private static By rdBtnPayPal =xpath("//*[@id=\"checkout-payment-method-load\"]/div[2]");
    private static By chkAgreement =id("agreement-1");
    private static By btnPurchase =xpath("//span/span[.='Purchase My Order']");
    private static By txtPayPal =xpath("//div[@id='loginSection']//b[@class='ng-binding']");
    private static By txtCreditCard =id("cc");
    private static By txtExpireValue =id("expiry_value");
    private static By txtCVV =id("cvv");
    private static By rdBtnNoThanks =xpath("//fieldset/div[3]/label[.='No, thanks.']");
    private static By chkPrivacyPolicy =xpath("//div[@class='ng-scope signupFields']//span[@class='ng-scope']");
    private static By txtPhoneNumber =id("telephone");
    private static By btnContinueAfterEnteringPayPalDetails =id("fullContinue");
    private static By txtValidationForInvalidCreditNumber =xpath("//ul[@role='presentation']//span[@class='ng-binding']");
    private static By btnContinueInPayPal =id("guestSubmit");
    private static By txtRequiredExpire =id("qxlwmfw");
    private static By txtRequiredCvv =id("tqlgj");
    private static By txtRequiredForCreditCardNumber =id("fyxdnqn");
    String value ="value";

    public void clickCartIcon() {
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(icnCart);
        syscoLabUIOgm.sleep(3);
}

    public void MoveToProductCategory() {
        syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.mouseHover(lnkProductCategory);
        syscoLabUIOgm.sleep(2);
    }

    public void clickBottleShop() {
        syscoLabUIOgm.click(lnkBottleShop);
        syscoLabUIOgm.sleep(2);
    }

    public void clickRoyalLiqueur() {
        syscoLabUIOgm.mouseHover(lnkRoyalLiqueur);
        syscoLabUIOgm.click(lnkRoyalLiqueur);
        syscoLabUIOgm.sleep(4);
    }

    public void clickAnItem() {
        syscoLabUIOgm.mouseHover(icnItem);
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(icnItem);
        syscoLabUIOgm.sleep(2);
    }

    public void clickAddToCartButton() {
        syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.mouseHover(btnAddToCart);
        syscoLabUIOgm.click(btnAddToCart);
        syscoLabUIOgm.sleep(2);
    }

    public void clickCheckOut() {
        syscoLabUIOgm.mouseHover(btnCheckOut);
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(btnCheckOut);
        syscoLabUIOgm.sleep(2);
    }

    public void clickAccountButton() {
        syscoLabUIOgm.click(btnAccount);
        syscoLabUIOgm.sleep(1);
    }

    public void clickContinue() {
        syscoLabUIOgm.click(btnContinue);
        syscoLabUIOgm.sleep(1);
    }

    public void removePostCode() {
        syscoLabUIOgm.click(icnRemovePostCode);
        syscoLabUIOgm.sleep(1);
    }

    public void clickRemoveLink() {
        int x = 0;
        while (Integer.parseInt(syscoLabUIOgm.getText(icnCartValue)) != 0) {
            syscoLabUIOgm.click(icnCart);
            syscoLabUIOgm.sleep(2);
            syscoLabUIOgm.click(lnkRemove);
            syscoLabUIOgm.sleep(1);
            syscoLabUIOgm.isAlertDisplayed();
            syscoLabUIOgm.sleep(2);
            syscoLabUIOgm.clickOkInWindowsAlert();
            syscoLabUIOgm.sleep(2);
        }
    }

    public String isDisplayedZeroInCart() {
        return (syscoLabUIOgm.getText(icnCartZeroValue));
    }

    public String isDisplayedOneInShoppingCart() {
        return (syscoLabUIOgm.getText(icnCartValue));
    }

    public boolean isDisplayedPrice() {
     return syscoLabUIOgm.isDisplayed(txtPrice);
    }

    public String isDisplayedEmptyEmailValidation() {
        return (syscoLabUIOgm.getText(txtEmptyEmailValidation));
    }

    public String isDisplayedCheckOut() {
        return (syscoLabUIOgm.getText(txtCheckOut));
    }

    public String isDisplayedLastName() {
        return (syscoLabUIOgm.getAttribute(txtLastName,value));
    }

    public String isDisplayedAddress() {
        return syscoLabUIOgm.getAttribute(txtAddress,value);
    }

    public String isDisplayedContactNumber() {
        return syscoLabUIOgm.getAttribute(txtContactNumber,value);
    }

    public String isDisplayedFirstName() {
        return (syscoLabUIOgm.getAttribute(txtFirstName,value));
    }

    public boolean isDisplayedName() {
      return   syscoLabUIOgm.isDisplayed(txtName);
    }

    public boolean isDisplayedPriceInPopUp() {
        syscoLabUIOgm.sleep(1);
        return (syscoLabUIOgm.isDisplayed(txtPriceInPopUp));
    }

    public boolean isDisplayedNameInPopUP() {
        return (syscoLabUIOgm.isDisplayed(txtNameInPopUp));
    }

    public void clickProceedToCheckOut() {
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(btnProceedToCheckOut);
        syscoLabUIOgm.sleep(2);
    }

    public void enterEmail(String email) {
        syscoLabUIOgm.sendKeys(txtEmail,email);
        syscoLabUIOgm.sleep(1);
    }

    public void enterPassword(String password) {
        syscoLabUIOgm.sendKeys(txtPassword,password);
        syscoLabUIOgm.sleep(1);
    }

    public void clearFirstName() {
        syscoLabUIOgm.sleep(2);
        for (int i = 1; i <= 8; i++) {
            syscoLabUIOgm.sendKeys(txtFirstName,Keys.ARROW_RIGHT);
            syscoLabUIOgm.sendKeys(txtFirstName, Keys.BACK_SPACE);
        }
        syscoLabUIOgm.sleep(2);
    }


    public void clearLastNameName() {
        syscoLabUIOgm.click(txtLastName);
        for (int i = 1; i <= 8; i++) {
            syscoLabUIOgm.sendKeys(txtLastName, Keys.BACK_SPACE);
        }
        syscoLabUIOgm.sleep(2);
    }

    public void clearAddress1() {
        syscoLabUIOgm.scrollDown(6);
        syscoLabUIOgm.click(txtAddress);
        for (int i = 1; i <= 8; i++) {
            syscoLabUIOgm.sendKeys(txtAddress, Keys.BACK_SPACE);
        }
        syscoLabUIOgm.sleep(2);
    }

    public void clearContactNumberName() {
        syscoLabUIOgm.click(txtContactNumber);
            for (int i = 1; i <= 15; i++) {
                syscoLabUIOgm.sendKeys(txtContactNumber, Keys.BACK_SPACE);
            }
            syscoLabUIOgm.sleep(2);
    }

    public String isDisplayedEmptyErrorFirstName() {
        return (syscoLabUIOgm.getText(txtValidationForEmptyFirstName));
    }

    public String isDisplayedEmptyErrorLastName() {
        return (syscoLabUIOgm.getText(txtValidationForEmptyLastName));
    }

    public String isDisplayedEmptyErrorAddress() {
        return (syscoLabUIOgm.getText(txtValidationForEmptyAddress));
    }

    public String isDisplayedEmptyErrorContactNumber() {
        return (syscoLabUIOgm.getText(txtValidationForEmptyContactNumber));
    }

    public void enterFirstName(String first_name) {
        syscoLabUIOgm.sendKeys(txtFirstName, first_name);
        syscoLabUIOgm.sleep(1);
    }

    public void enterLastName(String last_name) {
        syscoLabUIOgm.sendKeys(txtLastName, last_name);
        syscoLabUIOgm.sleep(1);
    }

    public void enterAddress1(String address_1) {
        syscoLabUIOgm.sendKeys(txtAddress, address_1);
        syscoLabUIOgm.sleep(1);
    }

    public void enterContactNumber(String contact_number) {
        syscoLabUIOgm.sendKeys(txtContactNumber, contact_number);
        syscoLabUIOgm.sleep(1);
    }

    public void enterPostCode(String post_code) {
        syscoLabUIOgm.sendKeys(txtPostCode, post_code);
        syscoLabUIOgm.sleep(1);
        try {
            Robot robot = new Robot();
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            syscoLabUIOgm.sleep(1);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }


    }

    public String isDisplayedDeliveryOptions() {
        return (syscoLabUIOgm.getText(txtDeliveryOptions));
    }

    public String isDisplayedPayPalAccount() {
        return (syscoLabUIOgm.getText(txtPayPal));
    }

    public String isDisplayedRequiredPopUpForExpire() {
        syscoLabUIOgm.click(txtExpireValue);
        return (syscoLabUIOgm.getText(txtRequiredExpire));
    }

    public String isDisplayedRequiredPopUpForCvv() {
        syscoLabUIOgm.click(txtCVV);
        return (syscoLabUIOgm.getText(txtRequiredCvv));
    }

    public String isDisplayedRequiredPopUpForCreditCardNumber() {
        return (syscoLabUIOgm.getText(txtRequiredForCreditCardNumber));
    }

    public String isDisplayedValidationForInvalidCreditNumber() {
        return (syscoLabUIOgm.getText(txtValidationForInvalidCreditNumber));
    }

    public void clickContinueInDeliveryOptions() {
        syscoLabUIOgm.mouseHover(btnContinueInDeliveryOptions);
        syscoLabUIOgm.click(btnContinueInDeliveryOptions);
        syscoLabUIOgm.sleep(1);
    }

    public void selectPayPalOption() {
        syscoLabUIOgm.mouseHover(rdBtnPayPal);
        syscoLabUIOgm.click(rdBtnPayPal);
        syscoLabUIOgm.sleep(1);
    }

    public void selectAgreement() {
        syscoLabUIOgm.click(chkAgreement);
        syscoLabUIOgm.sleep(1);
    }

    public void clickPurchase() {
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(btnPurchase);
        syscoLabUIOgm.sleep(3);
    }

    public void enterCreditCardNumber(String credit_card) {
        syscoLabUIOgm.sendKeys(txtCreditCard, credit_card);
        syscoLabUIOgm.sleep(1);
    }

    public void enterExpirevalue(String expire_value) {
        syscoLabUIOgm.sendKeys(txtExpireValue, expire_value);
        syscoLabUIOgm.sleep(1);
    }


    public void enterCVV(String cvv_value) {
        syscoLabUIOgm.sendKeys(txtCVV, cvv_value);
        syscoLabUIOgm.sleep(1);
    }

    public void clickNoThanks() {
        syscoLabUIOgm.scrollBottom();
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(rdBtnNoThanks);
        syscoLabUIOgm.sleep(1);
    }

    public void clickContinueAfterEnteringPayPalDetails() {
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(btnContinueAfterEnteringPayPalDetails);
        syscoLabUIOgm.sleep(3);
    }

    public void enterPhone(String phone_number) {
        syscoLabUIOgm.sendKeys(txtPhoneNumber, phone_number);
        syscoLabUIOgm.sleep(1);
    }

    public void clickPolicy() {
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(chkPrivacyPolicy);
        syscoLabUIOgm.sleep(1);
    }

    public void clickContinueInPayPal() {
        syscoLabUIOgm.scrollBottom();
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(btnContinueInPayPal);
        syscoLabUIOgm.sleep(2);
    }





}
