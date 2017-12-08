package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MemberPage {
	
	 public WebDriver driver;

	    public MemberPage(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	//基础管理
	@FindBy(linkText="基础管理")
	public WebElement ElementBasicManage;    
	
	//成员管理    
	@FindBy(linkText="成员管理")
	public WebElement ElementMemberManage;
	
	//选择制定成员
	@FindBy(xpath="//*[@id='member_list']/div[@class='item']/span[1][@class='name']")
	public List<WebElement> ElementGoalUsers;
	
	//添加成员
	@FindBy(id="add_user")
	public WebElement ElementAddMember;
	
	//选择部门
	@FindBy(linkText=("请选择部门"))
	public WebElement ElementSelectDept;

	//选择第一个部门子部门，div[n]-n表示第几个部门
	@FindBy(xpath="//div[@id='s_member_dept_list']/div/span/i")
	public WebElement ElementFirstSubDept;
	
	//二级部门
	@FindBy(xpath="//*[@id='member_department_list']/div/div/span/b")
	public List<WebElement> ElementSecondLevelDepts;
		
	//选择第一个部门末级部门
	@FindBy(xpath="//div[@id='s_member_dept_list']/div/div/span/b")
	public WebElement ElementFirstEndDept;
	
	//选择第二个部门子部门，div[n]-n表示第几个部门
	@FindBy(xpath="//div[@id='s_member_dept_list']/div[2]/span/i")
	public WebElement ElementSecondSubDept;
	
	//选择第二个部门末级部门
	@FindBy(xpath="//div[@id='s_member_dept_list']/div[2]/div/span/b")
	public WebElement ElementSecondEndDept;
	
	//输入用户名
	@FindBy(id="user_name")
	public WebElement ElementUserName;
	
	//输入手机号
	@FindBy(id="phone")
	public WebElement ElementUserPhone;
	
	//性别男
	@FindBy(xpath="//*[@id='add_user_form']/div[4]/div[2]/label[1][@class='form-radio']")
	public WebElement ElementBoy;
	
	//性别女
	@FindBy(xpath="//*[@id='add_user_form']/div[4]/div[2]/label[2][@class='form-radio']")
	public WebElement ElementGirl;
	
	//确认添加成员
	@FindBy(id="submitBtn")
	public WebElement ElementSubUser;
	
	//显示是否在职按键
	@FindBy(xpath="//label[@class='form-checkbox']")
	public WebElement ElementIsOrOn;
	
	//成员管理
	public void memberManage(){
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementMemberManage));
        ElementMemberManage.click();
	}
	//基础管理
	public void clickBasicManage(){
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementBasicManage));
        ElementBasicManage.click();
    }
	
	//点击添加部门成员
	public void addMember(){
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementAddMember));
        ElementAddMember.click();
	}

	public void addFirstClassMember(String username, String phonenumber){
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementSelectDept));
		ElementSelectDept.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ElementFirstSubDept));
		ElementFirstSubDept.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ElementFirstEndDept));
		ElementFirstEndDept.click();
		
        wait.until(ExpectedConditions.elementToBeClickable(ElementUserName));
		ElementUserName.sendKeys(username);
		
		wait.until(ExpectedConditions.elementToBeClickable(ElementUserPhone));
		ElementUserPhone.sendKeys(phonenumber);
						
	}
	
	//性别为女
	public void selectGirl(){
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementGirl));
		ElementGirl.click();
	
	}
	
	//性别为男
	public void subMember(){
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementSubUser));
		ElementSubUser.click();
	}
	
	//点击编辑成员，membername表示成员名
	public void editGoalUser(String membername){
		List<WebElement> wes=ElementGoalUsers;
		  WebElement target=null;
		  for(WebElement ws:wes){
			  if(ws.getText().trim().contains(membername)){
				  target=ws;
				  break;
			  }
		  }
		  target.findElement(By.xpath("./../span[6]/a[@class='doEdit']")).click();;
		  
	}
	
	//编辑目标部门
	public void editGoalDept(String department){
		List<WebElement> wes=ElementSecondLevelDepts;
		WebElement target=null;
		  for(WebElement ws:wes){
			  if(ws.getText().trim().equalsIgnoreCase(department)){
				  target=ws;
				  break;
			  }
		  }
		target.findElement(By.xpath("./../../span/span[2]/a[2][@class='doEdit']")).click();
	}
	
	//是否在职
	public void isJob(){
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementIsOrOn));
		ElementIsOrOn.click();
	}
}
