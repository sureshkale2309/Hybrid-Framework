package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OpenBrowser {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty(
                "webdriver.chrome.driver",
                "C://Automation//Software//geckodriver-v0.32.2-win32//geckodriver.exe");
        // Instantiate a ChromeDriver class.

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get("https://admin-demo.nopcommerce.com/login");
        WebElement email = driver.findElement(By.id("Email"));
            email.clear();
            email.sendKeys("admin@yourstore.com");
        WebElement pass = driver.findElement(By.id("Password"));
            pass.clear();
            pass.sendKeys("admin");
        driver.findElement(By.xpath("//*[@class='buttons']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p")).click();
       // driver.findElement(By.linkText("Customers")).click();
        driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")).click();
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        driver.findElement(By.id("Email")).sendKeys("asas@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("asd");
        driver.findElement(By.id("FirstName")).sendKeys("Ss");
        driver.findElement(By.id("LastName")).sendKeys("kk");

        driver.findElement(By.id("Gender_Male")).click();
        driver.findElement(By.xpath("//*[@class='btn btn-primary'][1]")).click();

    }
}
