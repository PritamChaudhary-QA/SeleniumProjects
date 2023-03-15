package com.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		//to launch webdriver
				//create reference variable i.e. called driver
				WebDriver driver=new ChromeDriver();
				//launch url or open any web application--pass url
				driver.get("https://manmatters.com/");
				//to maximize browser window
				driver.manage().window().maximize();
				//Title depends on clients requirment
				//String Expt="ManMatters Home page";//False condition
				String Expt="Man Matters- Telehealth Platform for Men's Health & Wellness"; //true condition
				String Actt=driver.getTitle();
				System.out.println("act title is "+Actt);
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
