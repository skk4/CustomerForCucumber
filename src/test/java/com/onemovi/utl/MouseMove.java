package com.onemovi.utl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {
	WebDriver driver;
	public MouseMove (WebDriver driver){
		
		this.driver=driver;
		
	}
	
    public void MouseToElement(WebElement goalElement){
    	Actions movetograde = new Actions(driver);  
  	  movetograde.moveToElement(goalElement).perform();
    	
    }
	 
}
