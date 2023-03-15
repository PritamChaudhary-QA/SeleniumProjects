package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		WebElement Manual=driver.findElement(By.linkText("Manual"));
		WebElement What=driver.findElement(By.linkText("What is Manual Testing?"));
		Actions a=new Actions(driver);
		a.moveToElement(Manual).build().perform();
		What.click();
		
		
		
		
		
		
		
		
		
		
	}

}
