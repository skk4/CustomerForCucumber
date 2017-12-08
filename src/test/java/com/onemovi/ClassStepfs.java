package com.onemovi;

import org.openqa.selenium.WebDriver;

import com.AdminLoginPage;
import com.ClassManagePage;
import com.onemovi.config.ConfigManager;
import com.onemovi.utl.MouseMove;
import com.onemovi.utl.SharedDriver;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;

public class ClassStepfs {
	WebDriver driver;
	private final ConfigManager config;
	private final AdminLoginPage adminloginpage;
	private final ClassManagePage classmanagepage;
	private final MouseMove mousemove;
	private String baseUrl;
	public ClassStepfs(SharedDriver driver, ConfigManager config, AdminLoginPage adminloginpage, ClassManagePage classmanagepage, MouseMove mousemove){
		this.driver=driver;
		this.config=config;
		this.adminloginpage=adminloginpage;
		this.classmanagepage=classmanagepage;
		this.mousemove=mousemove;
		
	}
	
	@假设("^已登录到班级管理$")
	public void 已登录到班级管理() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		baseUrl=this.config.get("base_path");
		this.driver.navigate().to(baseUrl);
		this.adminloginpage.adminLogin("t-qiaohu-00001", "123456");
		Thread.sleep(3000);
		this.classmanagepage.basicManage();
		Thread.sleep(3000);
		this.classmanagepage.classManage();
		Thread.sleep(3000);
		this.classmanagepage.importStudent();
		Thread.sleep(3000);
		this.classmanagepage.uploadStudent();
		Thread.sleep(3000);
		/*
		this.mousemove.MouseToElement(this.classmanagepage.ElementGradTwo);
		Thread.sleep(3000);
		this.mousemove.MouseToElement(this.classmanagepage.ElementGradTwotoo);
		Thread.sleep(3000);
		this.classmanagepage.editGrade();
		Thread.sleep(10000);
		this.classmanagepage.saveGrade();
		Thread.sleep(3000);
		this.classmanagepage.addClass();
		*/
		//this.classmanagepage.mouseToElement();
		/*
		this.classmanagepage.addPeriod();
		Thread.sleep(3000);
		this.classmanagepage.inputGrade("计算机系");
		Thread.sleep(3000);
		this.classmanagepage.saveGrade();
		Thread.sleep(3000);
		*/
		Thread.sleep(3000);
		
	}

	@当("^当添加班级$")
	public void 当添加班级() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@那么("^检查班级是否添加成功$")
	public void 检查班级是否添加成功() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
