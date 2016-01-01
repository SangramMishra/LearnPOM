package com.WordpressPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
    /*
	 * @author sangram
	 * This class will store all the locater and method of loginpage.
	 */
public class LogInPage {
	WebDriver driver;
	
By username=By.id("user_login");
By password=By.xpath(".//*[@id='user_pass']");
By loginBotton=By.name("wp-submit");

public LogInPage(WebDriver driver){
	this.driver=driver;
	
}
 public void userName(){
	 driver.findElement(username).sendKeys("admin");
	 
 }
 public void password(){
	 driver.findElement(password).sendKeys("demo123");
	 
 }
 public void clickLogin(){
	 driver.findElement(loginBotton).click();
	 
 }
}
