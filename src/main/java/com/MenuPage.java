package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
	
	
	
	 public WebDriver driver;

	  public MenuPage(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    

	    
	    
      //基础管理
      @FindBy(linkText="栏目管理")
      public WebElement ElementMenuManage;
      
      //一级栏目
      @FindBy(id="addColumn")
      public WebElement ElementTopMenu;
      
      
      public void menuManage(){
    	  WebDriverWait wait = new WebDriverWait(driver,30);
    	  wait.until(ExpectedConditions.elementToBeClickable(ElementMenuManage));
    	  ElementMenuManage.click();
      }
      
      public void addTopMenuManage(){
    	  WebDriverWait wait = new WebDriverWait(driver,30);
    	  wait.until(ExpectedConditions.elementToBeClickable(ElementTopMenu));
    	  ElementTopMenu.click();
      }	


}
