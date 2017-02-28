package com.onemovi;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.AdminLoginPage;
import com.onemovi.config.ConfigManager;
import com.onemovi.utl.SharedDriver;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;


public class AdminLoginStepfs {
	
	 //private WebDriver driver; 
   private final WebDriver driver;
   private final ConfigManager config;
   private final AdminLoginPage adminloginpage;
   private static String baseUrl;
   public AdminLoginStepfs(SharedDriver driver, ConfigManager config, AdminLoginPage adminloginpage) {  
       this.driver = driver;  
       this.config = config;  
       this.adminloginpage = adminloginpage;  
   }

   
   @假设("^打开onemovi后台管理网站$")
   public void 打开onemovi后台管理网站() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
	   baseUrl=this.config.get("base_path");
       this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);  
       this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);  
       this.driver.navigate().to(baseUrl); 
   }

   @那么("^检查后台管理网站是否打开$")
   public void 检查后台管理网站是否打开() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
	   Assert.assertEquals("校园电台 - 登录", driver.getTitle());
	   Thread.sleep(3000);
   }

   @当("^输入用户及密码，点登录时$")
   public void 输入用户及密码_点登录时() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
	   this.adminloginpage.adminLogin("t-qiaohu-00001", "123456");
	   
   }

   @那么("^检查是否登录成功$")
   public void 检查是否登录成功() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
	   Thread.sleep(3000);
	   Assert.assertEquals("校园电视台管理--基本设置", driver.getTitle());
   }

}
