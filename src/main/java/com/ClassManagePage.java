package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.onemovi.utl.MouseMove;

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
	
	//导入学生按键
	@FindBy(id="input_student")
	public WebElement ElementImportStudents; 
	
	//上传excel文件地址
	@FindBy(id="stu_Info")
	public WebElement ElementUploadStudents;
	
	//导入学生确定按键
	@FindBy(id="batch_add_btn")
	public WebElement ElementUploadBatch;
	
	//鼠标移动到第一个年度
	@FindBy(xpath="//*[@id='member_dept_list']/div[1]/div[1]/span")
	public WebElement ElementGrad; 
	
	//鼠标再次移动到第一个年度
	@FindBy(xpath="//*[@id='member_dept_list']/div[1]/div[1]/span/span/s[1]")
	public WebElement ElementGradtoo; 
	
	//鼠标移动到第二个年度
	@FindBy(xpath="//*[@id='member_dept_list']/div[1]/div[2]/span")
	public WebElement ElementGradTwo; 
	
	//鼠标移动到第二个年度
	@FindBy(xpath="//*[@id='member_dept_list']/div[1]/div[2]/span/span/s[1]")
	public WebElement ElementGradTwotoo; 
	
	//组织框架下选择年度
	@FindBy(xpath="//*[@id='member_department_list']/div[1]/div/span/b")
	public List<WebElement> ElementSecondLevelDepts;
	
	//添加年段
	@FindBy(id="add_period")
	public WebElement ElementAddPeriod;
	
	//添加班级
	@FindBy(id="add_class")
	public WebElement ElementAddClass;
	//年级名称
	@FindBy(id="dept_name")
	public WebElement ElementInputDepartment;
	
	// 保存年级按键
	@FindBy(id="save_dept")
	public WebElement ElementSaveDepartment;
	
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
	
	//添加年度按键
	public void addPeriod(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ElementAddPeriod));
		ElementAddPeriod.click();
	}
	
	//输入年度
	public void inputGrade(String dept_name){
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ElementInputDepartment));
		ElementInputDepartment.sendKeys(dept_name);
	}
	//保存年度
	public void saveGrade(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ElementSaveDepartment));
		ElementSaveDepartment.click();
	}
	
	//移动鼠标
	public void mouseToElement(){
		MouseMove mousemove;
		mousemove =new MouseMove(driver);
		mousemove.MouseToElement(ElementGrad);
	}
	
	//选择年度
	public void editGoalGrade(String grade){
		List<WebElement> wes=ElementSecondLevelDepts;
		WebElement target=null;
		  for(WebElement ws:wes){
			  if(ws.getText().trim().equalsIgnoreCase(grade)){
				  target=ws;
				  break;
			  }
		  }
		target.findElement(By.xpath("./../../span/span/s[1][@class='iconfont icon-edit']")).click();
	}
	
	//编辑年度
	public void editGrade(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ElementGradTwotoo));
		ElementGradTwotoo.click();
	}
	
	//添加班级
	public void addClass(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ElementAddClass));
		ElementAddClass.click();
	}
	
	//导入学生操作
	public void importStudent(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ElementImportStudents));
		ElementImportStudents.click();
		
	}
	
	//上传excel
	public void uploadStudent(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ElementUploadBatch));
		ElementUploadStudents.sendKeys("D:\\ImportModule\\studentTmpl.xls");
		ElementUploadBatch.click();
		
		
	}

}
