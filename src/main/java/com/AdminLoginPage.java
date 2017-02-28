package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminLoginPage {
	
	public WebDriver driver;

    public AdminLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    //输入用户
    @FindBy(id="username")
    public WebElement ElementUsernameInput;
    
    
    //输入密码
    @FindBy(id="password")
    public WebElement ElementPasswordInput;
    
    
    //后台管理登录键
    @FindBy(id="login_button")
    public WebElement ElementLoginClick;
    
    //输入管理员用户密码
    public void adminLogin(String _user, String _password){
    	
    	//管理员用户
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementUsernameInput));
        ElementUsernameInput.clear();
        ElementUsernameInput.sendKeys(_user);
        
        //管理员密码
        wait.until(ExpectedConditions.elementToBeClickable(ElementPasswordInput));
        ElementPasswordInput.clear();
        ElementPasswordInput.sendKeys(_password);
        
        //点击登录
        ElementLoginClick.click();
    }
    
    public void loginClick(){
    	
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementLoginClick));
        ElementLoginClick.click();
    }
    
    public String getPageTitle(){
    	
        return driver.getTitle();
    }

}
