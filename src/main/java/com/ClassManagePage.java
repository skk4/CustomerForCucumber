package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassManagePage {
	
		
		 public WebDriver driver;

		    public ClassManagePage(WebDriver driver){
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
		    }
		    

		    
		    
	//基础管理
	@FindBy(linkText="基础管理")
	public WebElement ElementBasicManage;
	
	//班级管理
	@FindBy(linkText="班级管理")
	public WebElement ElementClassManage;  
	
	//添加年度
	@FindBy(id="add_period")
	public WebElement ElementAddPeriod;
	
	//年级名称
	
	
	
	//进入基础管理页
	public void basicManage(){
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementBasicManage));
        ElementBasicManage.click();
	}	
	//进入成员管理页
	public void classManage(){
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementClassManage));
        ElementClassManage.click();
	}
	
	//添加年度
	public void addPeriod(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ElementAddPeriod));
		ElementAddPeriod.click();
	}
	
	public void addClassMember(){
		
	}

}
