package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		//to launch webdriver
				//create reference variable i.e. called driver
				WebDriver driver=new ChromeDriver();
				//launch url or open any web application--pass url
				driver.get("https://jqueryui.com/");
				//to maximize browser window
				driver.manage().window().maximize();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,800)");
				driver.findElement(By.linkText("Datepicker")).click();
				driver.switchTo().frame(0);
				driver.findElement(By.id("datepicker")).click();
				driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[2]/td[7]/a"));
				//again click on date element
				driver.findElement(By.id("datepicker")).click();
				for(int i=1;i<5;i++) {
					
				}
				driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span")).click();
			
				//to click on arrow button to change month and loop for to jump on July month
				//driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[5]/td[1]/a")).click();
					

	}

}
