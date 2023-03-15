package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\SelenuimAssignment_mousehover_Dropdown\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/index.php");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("txtUserName"));
		username.sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		//String Expt="Orange home Page";//false condition
		String Expt="OrangeHRM";//True condition
		String Actt=driver.getTitle();
		System.out.println("Act title is "+Actt);
		if (Expt.equals(Actt))
		{
			System.out.println("Expt match with Actt");
			
		} 
		else
		{
			System.out.println("Expt does not match with Actt");

		}
		
		
	}

}
