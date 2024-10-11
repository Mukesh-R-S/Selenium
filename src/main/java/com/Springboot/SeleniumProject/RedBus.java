package com.Springboot.SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukes\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.redbus.in/");

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement ele=null;
			Thread.sleep(3000);
			
			//from city
			ele=driver.findElement(By.id("src"));
			ele.clear();
			ele.click();
			ele.sendKeys("Pollachi");
			
			ele=driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li[1]/div/text"));
			ele.click();
			
			//to city
			ele=driver.findElement(By.id("dest"));
			ele.clear();
			ele.click();
			ele.sendKeys("bang");
			ele=driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/ul/li[3]/div/text[1]"));
			ele.click();
			
			//Date
			
			ele=driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[4]"));
			ele.click();
			
			
			
			
			
			
			Thread.sleep(3000);
			driver.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
