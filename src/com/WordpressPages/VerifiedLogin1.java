/**
 * 
 */
package com.WordpressPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author sangram
 *
 */
public class VerifiedLogin1 {
	WebDriver driver;
	
By username=By.id("user_login");
By password=By.xpath(".//*[@id='user_pass']");
By loginBotton=By.name("wp-submit");

public VerifiedLogin1(WebDriver driver){
	this.driver=driver;
	
}
  public void loginWordpress(String userId,String pass){
	  driver.findElement(username).sendKeys("userID");
	  driver.findElement(password).sendKeys("pass");
	  driver.findElement(loginBotton).click();
  }
  
 /*
  * By using these upper code as parameterizing in a single method 
  * We reduces the writing of much code...in a single method.
  * 
  * 
   public void userName(String userID){
	 driver.findElement(username).sendKeys("userID");
	 
 }
 public void password(String pass){
	 driver.findElement(password).sendKeys("pass");
	 
 }
 public void clickLogin(){
	 driver.findElement(loginBotton).click();*/
	 
 }




