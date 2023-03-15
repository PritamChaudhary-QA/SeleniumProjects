package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_N_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		//to launch webdriver
				//create reference variable i.e. called driver
				WebDriver d=new ChromeDriver();
				//launch url or open any web application--pass url
				d.get("https://jqueryui.com/");
				//to maximize browser window
				d.manage().window().maximize();
				d.findElement(By.linkText("Droppable")).click();
				d.switchTo().frame(0);	
				WebElement Drag=d.findElement(By.xpath("//*[@id=\'draggable\']/p"));
				WebElement Drop=d.findElement(By.xpath("//*[@id=\'droppable\']"));
				Actions a=new Actions(d);
				a.dragAndDrop(Drag, Drop).build().perform();
				d.switchTo().defaultContent();//exit from current page and move to another page.
				d.findElement(By.linkText("Resizable")).click();
				d.switchTo().frame(0);
				WebElement Resize=d.findElement(By.xpath("//*[@id=\'resizable\']/div[3]"));
				a.clickAndHold(Resize).moveByOffset(45, 125).build().perform();

	}

}
