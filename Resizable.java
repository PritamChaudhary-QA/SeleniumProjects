package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/");
		d.manage().window().maximize();
		d.findElement(By.linkText("Resizable")).click();
		d.switchTo().frame(0);
		WebElement Resize=d.findElement(By.xpath("//*[@id=\'resizable\']/div[3]"));
		Actions a=new Actions(d);
		a.clickAndHold(Resize).moveByOffset(45, 125).build().perform();
	

	}

}
