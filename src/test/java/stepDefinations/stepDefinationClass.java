package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class stepDefinationClass {

    WebDriver driver;
    @Given("I launch firefox browser")
    public void i_launch_chrome_browser() throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C://Automation//Software//geckodriver-v0.32.2-win32//geckodriver.exe");

        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("I open orangeHrm homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        boolean status =  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]")).isDisplayed();
        Assert.assertEquals(true, status);

    }

    @Then("close browser")
    public void close_browser() {
        driver.close();

    }
}
