package utils;

public class Constants {
    public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
    public static final int EXPLICIT_WAIT = 30;
    public static final int IMPLICIT_WAIT = 10;

    public static final String TESTDATA_FILEPATH =
            System.getProperty("user.dir") + "/src/test/resources/testdata/CucumberFirst.xlsx";

    public static final String SCREENSHOT_FILEPATH =   System.getProperty("user.dir") + "/screenshots/";
}
//provide the path to config.properties (where we have our data to use)
//constants - variable that will not gonna be changed