package stepDefinations;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObject.AddCustomerPage;
import pageObject.LoginPage;

public class BaseClass {

    public WebDriver driver;
    public LoginPage lp;
    public AddCustomerPage addCust;

    //Created for generating random string for uniqe email ID
    public static String randomString(){
        String generatedString1= RandomStringUtils.randomAlphabetic(5);
        return generatedString1;
    }
}
