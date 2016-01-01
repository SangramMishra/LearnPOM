/**
 * 
 */
package com.Wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import com.WordpressPages.VerifiedLogin1;

/**
 * @author sangram
 *
 */
public class Verifywordpresslogin {
	
	@Test
	public void verifyLogin(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		VerifiedLogin1 login=new VerifiedLogin1(driver);
		/*login.userName("admin");
		login.password("demo123");
		login.clickLogin();*/
		
		login.loginWordpress("admin", "demo123");
		
		driver.quit();
		
		
		
	}
	
	

}
