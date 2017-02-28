package com.onemovi;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.AdminLoginPage;
import com.DepartmentPage;
import com.onemovi.config.ConfigManager;
import com.onemovi.utl.SharedDriver;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;

public class AddDepartmentStepfs {
	
	 private final WebDriver driver;
	 private final ConfigManager config;
	 private final AdminLoginPage adminloginpage;
	 private final DepartmentPage departmentpage;
	 private static String baseUrl;
     public AddDepartmentStepfs(SharedDriver driver, ConfigManager config, AdminLoginPage adminloginpage, DepartmentPage departmentpage) {  
	       this.driver = driver;  
	       this.config = config;  
	       this.adminloginpage = adminloginpage; 
	       this.departmentpage = departmentpage;
	   }
	   
	   @假设("^用管理员已登录后台$")
	   public void 用管理员已登录后台() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       //throw new PendingException();
		   baseUrl=this.config.get("base_path");
		   this.driver.navigate().to(baseUrl); 
		   this.adminloginpage.adminLogin("t-qiaohu-00001", "123456");
		   Thread.sleep(3000);
		   this.departmentpage.clickBasicManage();
		   Thread.sleep(3000);
		  
		   
		   
		   
	   }

	   @当("^当添加部门$")
	   public void 当添加部门() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	      // throw new PendingException();
		   /*
		    * **添加删除部门
		    */
		   Thread.sleep(3000);
		   this.departmentpage.addDepartment();
		   Thread.sleep(3000);
		   this.departmentpage.inputDept("行政部");
		   Thread.sleep(3000);
		   this.departmentpage.subDept();
		   Thread.sleep(3000);
		   this.departmentpage.addFirstSubDept();
		   Thread.sleep(3000);
		   this.departmentpage.inputDept("后勤");
		   this.departmentpage.subDept();
		   Thread.sleep(3000);
		   this.departmentpage.deleteTriDept();
		   Thread.sleep(3000);
		   this.departmentpage.makeDeleteSubDept();
		   Thread.sleep(3000);
		   


	   }
/*
	   @那么("^显示部门页面$")
	   public void 显示部门页面() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       //throw new PendingException();
		  
		   
	   }

	   @当("^点取消按键时$")
	   public void 点取消按键时() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       //throw new PendingException();
		   this.departmentpage.subDept();
		   
	   }

	   @那么("^检查部门是否添加成功$")
	   public void 检查部门是否添加成功() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       //throw new PendingException();
	   } 
	*/   
}
