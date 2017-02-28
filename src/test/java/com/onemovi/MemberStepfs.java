package com.onemovi;

import org.openqa.selenium.WebDriver;

import com.AdminLoginPage;
import com.MemberPage;
import com.onemovi.config.ConfigManager;
import com.onemovi.utl.SharedDriver;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;

public class MemberStepfs {
	
	private final WebDriver driver;
	private final ConfigManager config;
	private final AdminLoginPage adminloginpage;
	private final MemberPage memberpage;
	private static String baseUrl;

	public MemberStepfs(SharedDriver driver, ConfigManager config, AdminLoginPage adminloginpage ,	MemberPage memberpage){
		this.driver = driver;  
	    this.config = config;  
	    this.adminloginpage = adminloginpage; 
	    this.memberpage = memberpage;
		
	}
	
	
	@假设("^已登录到成员管理$")
	public void 已登录到成员管理() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    baseUrl=this.config.get("base_path");
		this.driver.navigate().to(baseUrl); 
		this.adminloginpage.adminLogin("t-qiaohu-00001", "123456");
		Thread.sleep(3000);
		this.memberpage.clickBasicManage();
		Thread.sleep(3000);
		//this.memberpage.editGoalDept("财务部");
		//Thread.sleep(3000);
		
		this.memberpage.memberManage();
		Thread.sleep(3000);
		this.memberpage.isJob();
		Thread.sleep(3000);
		this.memberpage.editGoalUser("谢东风");
		Thread.sleep(3000);
	}
/*
	@当("^当添加成员$")
	public void 当添加成员() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		this.memberpage.addMember();
		Thread.sleep(3000);
		this.memberpage.addFirstClassMember("谢东风", "13606923591");
		Thread.sleep(3000);
		this.memberpage.selectGirl();
		Thread.sleep(3000);
		this.memberpage.subMember();
	}

	@那么("^检查成员是否添加成功$")
	public void 检查成员是否添加成功() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	*/
}
