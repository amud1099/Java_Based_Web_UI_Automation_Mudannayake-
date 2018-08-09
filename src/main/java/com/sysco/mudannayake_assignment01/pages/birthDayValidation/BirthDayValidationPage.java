package com.sysco.mudannayake_assignment01.pages.birthDayValidation;

import com.sysco.mudannayake_assignment01.pages.loadBundabergrumPage.LoginPage;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;


public class BirthDayValidationPage extends LoginPage {

    private By ddDay = By.id("age_select_day");
    private By ddMonth = By.id("age_select_month");
    private By ddYear = By.id("age_select_year");
    private By txtValidation = By.id("age_missing_message");
    private By btnEnter = By.id("age_confirm_btn");
    private By lnkMyAccount = By.xpath("//a[@title='My Account']");
    private By txtValidationWhenKeepsAllFieldsEmpty = By.xpath("//div[@id='age_missing_message']/span[@class='langable']");

    public void clickDayDropDown() {
        syscoLabUIOgm.click(ddDay);
        syscoLabUIOgm.sleep(1);
        try {
            Robot robot = new Robot();
            for (int i = 1; i <= 5; i++) {
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            syscoLabUIOgm.sleep(1);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    public void clickMonthDropDown() {
        syscoLabUIOgm.click(ddMonth);
        syscoLabUIOgm.sleep(1);
        try {
            Robot robot = new Robot();
            for (int i = 1; i <= 4; i++) {
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            syscoLabUIOgm.sleep(1);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    public void clickYearDropDownForLessThan18() {
        syscoLabUIOgm.click(ddYear);
        syscoLabUIOgm.sleep(1);
        try {
            Robot robot = new Robot();
            for (int i = 1; i <= 10; i++) {
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            syscoLabUIOgm.sleep(1);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public String isDisplayedValidationForLessThan18() {
       return syscoLabUIOgm.getText(txtValidation);
    }

    public String isDisplayedValidationWhenKeepsAllTheFieldEmpty() {
        return syscoLabUIOgm.getText(txtValidationWhenKeepsAllFieldsEmpty);
    }

    public void clickEnter() {
        syscoLabUIOgm.click(btnEnter);
        syscoLabUIOgm.sleep(1);
    }

    public void clickYearDropDownForGreaterThan18() {
        syscoLabUIOgm.click(ddYear);
        syscoLabUIOgm.sleep(1);
        try {
            Robot robot = new Robot();
            for
                    (int i = 1; i <= 2; i++) {
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            syscoLabUIOgm.sleep(1);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void clickYearDropDown() {
        syscoLabUIOgm.click(ddYear);
        syscoLabUIOgm.sleep(1);
        try {
            Robot robot = new Robot();
            for
                    (int i = 1; i <= 12; i++) {
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            syscoLabUIOgm.sleep(1);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public String isDisplayedMyAccountLink() {
       return (syscoLabUIOgm.getAttribute(lnkMyAccount,"title"));
    }
}



