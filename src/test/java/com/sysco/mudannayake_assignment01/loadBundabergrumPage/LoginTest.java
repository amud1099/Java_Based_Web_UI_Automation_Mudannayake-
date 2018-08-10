package com.sysco.mudannayake_assignment01.loadBundabergrumPage;


import com.sysco.mudannayake_assignment01.data.LoginData;
import com.sysco.mudannayake_assignment01.functions.loadBundabergrumPage.Login;
import com.sysco.mudannayake_assignment01.utils.ExcelUtil;
import com.sysco.mudannayake_assignment01.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - Checkout");
    }

    @Test
    public void testLogin() throws Exception {
        // Sample way to retrive data from excel
        LoginData loginData = ExcelUtil.getLoginData("$as238l");

        //UI Automation  sample
        Login.loadPage();
        Login.quiteDriver();

    }
}