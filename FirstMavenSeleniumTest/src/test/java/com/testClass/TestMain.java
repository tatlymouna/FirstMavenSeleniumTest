package com.testClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestMain {

	  @Test
	  public void Test() throws MalformedURLException
		{
		  System.out.println("debut test");
				
			DesiredCapabilities cap=new DesiredCapabilities();
		    cap.setBrowserName("chrome");
		    WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
//		    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("0652455762");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jamali11*");
			driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
			driver.quit();
			System.out.println("**********test validé*************");
		}
	}