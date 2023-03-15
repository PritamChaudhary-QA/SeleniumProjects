package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		//to launch webdriver
				//create reference variable i.e. called driver
				WebDriver driver=new ChromeDriver();
				//launch url or open any web application--pass url
				driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
				//to maximize browser window
				driver.manage().window().maximize();
				WebElement username=driver.findElement(By.name("txtUserName"));
				username.sendKeys("admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin");
				driver.findElement(By.name("Submit")).click();
				WebElement Admin=driver.findElement(By.xpath("//*[@id='admin']/a/span"));
				WebElement Company_Info=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/a/span"));
				WebElement Location=driver.findElement(By.xpath("//*[@id='admin']/ul/li[1]/ul/li[2]/a/span"));
				//to handle mouse sequential action call actions class
				Actions a=new Actions(driver);
				a.moveToElement(Admin).build().perform();
				a.moveToElement(Company_Info).build().perform();
		        Location.click();
		      	driver.switchTo().frame("rightMenu");
		      	WebElement drop=driver.findElement(By.id("loc_code"));
		      	Select s=new Select(drop);
		      	s.selectByIndex(3);
		      	s.selectByValue("0");
		      	s.selectByVisibleText("ID");

	}

}
