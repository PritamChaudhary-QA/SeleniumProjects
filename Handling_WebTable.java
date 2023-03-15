package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//get method used to launch any application -- pass url
				d.get("https://techcanvass.com/examples/webtable.html");
				d.manage().window().maximize();
				//fetch heading text on page
				String Text=d.findElement(By.xpath("/html/body/h1")).getText();
				System.out.println(Text);
				//count row and col number
				List<WebElement> tr=d.findElements(By.xpath("//*[@id='t01']/tbody/tr"));
				List<WebElement> td=d.findElements(By.xpath("//*[@id='t01']/tbody/tr[2]/td"));
				int row=tr.size();
				int col=td.size();
				System.out.println("row no is "+row+" & col no is "+col);
				for(int i=3;i<=row;i++)
				{
					for(int j=1;j<=col;j++)
					{
						//fetch all data from every cell and print it on console
						System.out.println(d.findElement(By.xpath("//*[@id='t01']/tbody/tr["+i+"]/td["+j+"]")).getText());
					}
				}	

	}

}
