package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DepartmentPage {
    public WebDriver driver;

    public DepartmentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    
    //基础管理
    @FindBy(linkText="基础管理")
    public WebElement ElementManage;
    
    //基础设置
    @FindBy(linkText="基础设置")
    public WebElement ElementSet;
    
    //添加部门
    @FindBy(id="addDept_btn")
    public WebElement ElementAddDept;
    
    //添加第一个二级部门子部门
    @FindBy(xpath="//*[@id='member_department_list']/div/div[1]/span/span[2]/a[1][@class='doAdd']")
    public WebElement ElementAddFirstSubDept;
    
    //编辑第一个二级部门子部门
    @FindBy(xpath="//*[@id='member_department_list']/div/div[1]/span/span[2]/a[2][@class='doEdit']")
    public WebElement ElementEditFirstSubDept;
    
    //删除第一个二级部门子部门
    @FindBy(xpath="//*[@id='member_department_list']/div/div[1]/span/span[2]/a[3][@class='doDelete']")
    public WebElement ElementDeleteFirstSubDept;
    
    		
    //删除三级子部门
    @FindBy(xpath="//*[@id='member_department_list']/div/div[1]/div/span/span[2]/a[3][@class='doDelete']")
    public WebElement ElementDeleteFirstTriDept;    		
    		
    		
    //确定删除子部门按键
    @FindBy(xpath="//div[starts-with(@id,'layui-layer')]/div/a[1][@class='layui-layer-btn0']")
    public WebElement ElementSubdelete;
    
    //取消删除子部门按键
    @FindBy(xpath="//div[starts-with(@id,'layui-layer')]/div/a[2][@class='layui-layer-btn1']")
    public WebElement ElementCancelSubdelete;
    
    //删除三级部门按键
    
    
    //添加第二个二级部门子部门
    @FindBy(xpath="//*[@id='member_department_list']/div/div[2]/span/span[2]/a[1][@class='doAdd']")
    public WebElement ElementAddsecondSubDept;
    
    //部门输入框 
    @FindBy(id="dept_name")
    public WebElement ElementDeptName;
    
    //部门确定按键
    
    @FindBy(id="subBtn")
    public WebElement ElementDeptSub;
    
    //部门取消按键 
    @FindBy(id="cancelBtn")
    public WebElement ElementDeptCancel;
    
    

    //获取页面标题
    public String getPageTitle(){
        return driver.getTitle();
    }
    
    //点击添加部门按键
    public void addDepartment(){
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementAddDept));
        ElementAddDept.click();
    	
    }
    
  // 点击基础管理按键
    public void clickBasicManage(){
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementManage));
        ElementManage.click();
    }
    
    //输入添加的部门名称
    public void inputDept(String depttext){
       	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementDeptName));
        ElementDeptName.sendKeys(depttext);
    }
    
    //创建部门
    public void  subDept(){
       	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementDeptSub));
        ElementDeptSub.click();
    }
    
    //取消创建部门
    public void  cancelDept(){
       	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementDeptCancel));
        ElementDeptCancel.click();
    }
    
    //添加二级部门
    
    public void addFirstSubDept(){
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementAddFirstSubDept));
        ElementAddFirstSubDept.click();
    }
    
	//选中二级部门
	@FindBy(xpath="//*[@id='member_department_list']/div/div/span/b")
	public List<WebElement> ElementSecondLevelDepts;
	
    //删除二级部门
    
    public void deleteSubDept(){
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementDeleteFirstSubDept));
        ElementDeleteFirstSubDept.click();
    }
    //删除三级部门
    public void deleteTriDept(){
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementDeleteFirstTriDept));
        ElementDeleteFirstTriDept.click();
    }
    
    // 确定删除二级部门
    public void makeDeleteSubDept(){
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementSubdelete));
        ElementSubdelete.click();
    }
    

    //取消删除二级部门
    public void cancelDeleteSubDept(){
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ElementCancelSubdelete));
        ElementCancelSubdelete.click();
    }
    
    //部门xpath地址定位，使用文本内容，定位目标
    public WebElement locatedDeptForText(String text){
    	 WebElement target_dpt=null;
    		List<WebElement> wes1=driver.findElements(By.xpath("//div[@id='member_department_list']/div/span/div/span[@class='opt dospan']/a[@class='doAdd']"));
    		for(WebElement ws:wes1){
    		if(ws.getText().trim().equalsIgnoreCase(text)){
    				  target_dpt=ws;
    				  break;
    			  }
    		  }
    		
    		return target_dpt;
    }
    
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
}
