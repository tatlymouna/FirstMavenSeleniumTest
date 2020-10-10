package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestClass {

	  @Test
	  public void Test1() throws MalformedURLException
		{
		  System.out.println("debut test");
				
			DesiredCapabilities cap=new DesiredCapabilities();
		    cap.setBrowserName("chrome");
		    WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		    driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("0652455762");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jamali11*");
			driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
			driver.quit();
			System.out.println("**********test validé*************");
		}
	}