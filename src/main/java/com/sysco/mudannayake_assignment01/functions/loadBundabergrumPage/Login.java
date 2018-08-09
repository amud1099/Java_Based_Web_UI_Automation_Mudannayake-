package com.sysco.mudannayake_assignment01.functions.loadBundabergrumPage;

import com.sysco.mudannayake_assignment01.common.Constants;
import com.sysco.mudannayake_assignment01.pages.loadBundabergrumPage.LoginPage;
import com.sysco.mudannayake_assignment01.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class Login {

    public static LoginPage ogmLoginPage = new LoginPage();
    private Login(){}

    public static void loadPage() {

        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            ogmLoginPage.loadLoginPage(capabilities, Constants.APP_URL);
        } else {
            ogmLoginPage.loadLoginPage(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
    }


    public static void quiteDriver() {
        ogmLoginPage.quitDriver();
    }


}
