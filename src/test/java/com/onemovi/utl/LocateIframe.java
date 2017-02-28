package com.onemovi.utl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocateIframe {
	
	
	/**
	 * 定位iframe
	 * @throws InterruptedException 
	 */
	public static WebDriver locateIframe(WebDriver driver,String iframe_name) throws InterruptedException{
		WebElement iframe=driver.findElement(By.xpath("//iframe[starts-with(@id,'"+iframe_name+"')]"));
		Thread.sleep(5000);
		driver=driver.switchTo().frame(iframe);
		return driver;
	}
	
	
	public static WebDriver locateIframeTwo(WebDriver driver,String iframe_name,String src) throws InterruptedException{
		WebElement iframe=driver.findElement(By.xpath("//iframe[starts-with(@id,'"+iframe_name+"') and starts-with(@src,'"+src+"')]"));
		Thread.sleep(5000);
		driver=driver.switchTo().frame(iframe);
		return driver;
	}
	

}
