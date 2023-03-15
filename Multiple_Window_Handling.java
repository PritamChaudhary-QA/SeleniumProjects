package com.web;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//open URL
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		//click on pen checkbox
		d.findElement(By.xpath("//*[@id='HTML33']/div[1]/input[1]")).click();
		//click on open pop up window element
		d.findElement(By.linkText("Open a popup window")).click();
		//fetch windowid from both window so create set collectrion to store unique value and
		//call getWindowHandles method which fetch all open window ids and store it in set instance
		//List<Webelement>--collection<datatype
		Set<String> windowids=d.getWindowHandles(); 
		//print all windowid from set instance
		System.out.println("window ids are-----"+windowids);
		//call iterator to iterate one by one windowid and store it into different variable
		java.util.Iterator<String> it=windowids.iterator();
		//use next method to fetch one by one id in iterator instance and store it in string variable
		//store first windowid in parentwindow var
		String parentwindow=it.next();
		//store first windowid in childwindow var
		String childwindow=it.next();
		System.out.println("parent window is is--"+parentwindow);
		System.out.println("child window id is---"+childwindow);
		//click on bike radio button on parent window
		d.findElement(By.xpath("//*[@id='HTML32']/div[1]/input[1]")).click();
		//switch driver to child window
		d.switchTo().window(childwindow);		
		//fetch second line text from child window
		String text=d.findElement(By.id("para2")).getText();
		//print text
		System.out.println("text from childwindow--"+text);
		//switch driver on parent window
		d.switchTo().window(parentwindow);
		//send input text in textbox
		d.findElement(By.id("ta1")).sendKeys("done");

	}

}
