package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webelement_MouseHover_Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		//to launch webdriver
				//create reference variable i.e. called driver
				WebDriver driver=new ChromeDriver();
				//launch url or open any web application--pass url
				driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
				//to maximize browser window
				driver.manage().window().maximize();
				WebElement Products=driver.findElement(By.id("product-menu-toggle"));
				WebElement Live=driver.findElement(By.xpath("//*[@id='product-menu-dropdown']/div[1]/ul[1]/li[2]/a/div[2]/div[2]"));
				WebElement Developers=driver.findElement(By.xpath("//*[@id=\'developers-menu-toggle\']/span"));
				WebElement Support=driver.findElement(By.xpath("//*[@id=\'developers-menu-dropdown\']/li[5]/a"));
				Actions a=new Actions(driver);
				a.moveToElement(Products).build().perform();
				a.moveToElement(Live).build().perform();
				a.moveToElement(Developers).build().perform();
				Support.click();
				
	}

}
