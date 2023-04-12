package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(id="Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//*[@class='buttons']")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath = "/html/body/div[3]/nav/div/ul/li[3]/a")
    @CacheLookup
    WebElement lnkLogout;

    public void setUserName(String uname){
        txtEmail.clear();
        txtEmail.sendKeys(uname);
    }

    public void setPassword(String pwd){
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public void clickLogout(){
        lnkLogout.click();
    }

}
