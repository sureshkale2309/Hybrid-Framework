package stepDefinations;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.*;
import pageObject.AddCustomerPage;
import pageObject.LoginPage;

import java.util.concurrent.TimeUnit;

public class Steps extends BaseClass {


    @Given("User launch a Firefox Browser")
    public void user_launch_a_firefox_browser() {
        System.setProperty(
                "webdriver.chrome.driver",
                "D://Automation//Driver//geckodriver-v0.32.2-win32//geckodriver.exe");
        driver = new FirefoxDriver();
        lp=new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User opens URL {string}")
    public void user_opens_url(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(10000);
    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String pass) {
        lp.setUserName(email);
        lp.setPassword(pass);
    }
    @When("Click on Login")
    public void click_on_login() throws InterruptedException {
        lp.clickLogin();
        Thread.sleep(10000);

    }
    @Then("Page Title Should be {string}")
    public void page_title_should_be(String string) throws InterruptedException {
        if(driver.getPageSource().contains("Login was unsuccessful.")){
            driver.close();
            Assert.assertTrue(false);
        }else {
            Assert.assertEquals(string, driver.getTitle());
        }
        Thread.sleep(5000);
    }
    @When("User click on Log out link")
    public void user_click_on_log_out_link() throws InterruptedException {
        Thread.sleep(5000);
        lp.clickLogout();

    }

    //Add New Customer Feature step definitions..................................

    @Then("User can view Dashboard")
    public void user_can_view_dashboard() throws InterruptedException {
        addCust = new AddCustomerPage(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle() );
        Thread.sleep(3000);
    }
    @When("User click on customer Menu")
    public void user_click_on_customer_menu() throws InterruptedException {
        addCust.clickOnCustomerMenu();
        Thread.sleep(2000);
    }
    @When("Click on customer Menu Item")
    public void click_on_customer_menu_item() throws InterruptedException {
        addCust.clickOnCustomerMenuItem();
        Thread.sleep(3000);

    }
    @When("Click on Add new button")
    public void click_on_add_new_button() throws InterruptedException {
        addCust.clickOnAddeNewButton();
        Thread.sleep(3000);
    }
    @Then("User can View Add new customer page")
    public void user_can_view_add_new_customer_page() {

        Assert.assertEquals("Add a new customer / nopCommerce administration",addCust.getPageTitle());
    }
    @When("User enter customer info")
    public void user_enter_customer_info() throws InterruptedException {
        Thread.sleep(2000);
        String email = randomString()+"@gmail.com";
        addCust.setEmail(email);
        addCust.setPassword("test123");
        addCust.setFirstName("Sush");
        addCust.setLastName("Kal");
        addCust.setGender("Male");
    }
    @When("Click on Save button")
    public void click_on_save_button() throws InterruptedException {
        addCust.clickOnSaveButton();
        Thread.sleep(2000);
    }
    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String msg) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
                .contains("The new customer has been added successfully."));
    }

    @Then("Close browser")
    public void close_browser() {
        driver.close();

    }
}
