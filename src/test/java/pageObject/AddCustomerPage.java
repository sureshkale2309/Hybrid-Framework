package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
    public WebDriver ldriver;

    public AddCustomerPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    By lnkCustomers_menu = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p");
    By lnkCutomers_menuitem = By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p");
    By btnAddNew = By.xpath("//*[@class='btn btn-primary']");
    By txtEmail = By.id("Email");
    By txtPassword = By.id("Password");
    By txtFirstName=By.id("FirstName");
    By txtLastName=By.id("LastName");
    By rdMaleGender = By.id("Gender_Male");
    By rdFemaleGender = By.id("Gender_Female");
    By btnSave= By.xpath("//*[@class='btn btn-primary'][1]");

    //Actions Method

    public String getPageTitle(){
        return ldriver.getTitle();
    }
    public void clickOnCustomerMenu(){
        ldriver.findElement(lnkCustomers_menu).click();
    }

    public void clickOnCustomerMenuItem(){
        ldriver.findElement(lnkCutomers_menuitem).click();
    }

    public void clickOnAddeNewButton(){
        ldriver.findElement(btnAddNew).click();
    }

    public void setEmail(String email){
        ldriver.findElement(txtEmail).sendKeys(email);
    }

    public void setPassword(String pass){
        ldriver.findElement(txtPassword).sendKeys(pass);
    }

    public void setFirstName(String fname){
        ldriver.findElement(txtFirstName).sendKeys(fname);
    }
    public void setLastName(String lname){
        ldriver.findElement(txtLastName).sendKeys(lname);
    }
    public void setGender(String gender){
        if(gender.equals("Male")){
            ldriver.findElement(rdMaleGender).click();
        }else if(gender.equals("Female")){
            ldriver.findElement(rdFemaleGender).click();
        }else {
            ldriver.findElement(rdMaleGender).click();
        }
    }

    public void clickOnSaveButton(){
        ldriver.findElement(btnSave).click();
    }


}
