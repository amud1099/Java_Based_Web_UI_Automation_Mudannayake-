package com.sysco.mudannayake_assignment01.common;

public class Constants {
    public static final String TEST_ENV = System.getProperty("test.env", "QA");
    public static final String TEST_RELEASE = System.getProperty("test.release", "<release name>");
    public static final String TEST_PROJECT = System.getProperty("test.project", "<project name>");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "true"));
    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));
    public static final String APP_URL = System.getProperty("app.url", "https://www.bundabergrum.com.au/");
    public static final String APP_OS = System.getProperty("app.os", "WIN10");
    public static final String APP_BROWSER = System.getProperty("app.browser", "chrome");


    //--------------------------------AccountLoginConstants---------------------------------------------
    public static final String EMAIL = System.getProperty("Bundabergrum.email", "williamjacob802@gmail.com");
    public static final String PASSWORD = System.getProperty("Bundabergrum.password", "V7N5Ryf5siAz5SXlPHHp7OKx29f8KXPpVUst5zE6cwM=");



}