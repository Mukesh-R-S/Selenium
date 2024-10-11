package com.Springboot.SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignImplicitWAIT {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukes\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			//driver.navigate().to("");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement element=null;
			Thread.sleep(3000);
			
			element=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[5]"));
			//element.sendKeys("iphone 16");
			
			String text=element.getText();
			System.out.println("Text Value :"+text);
			
			String att=element.getAttribute("data-csa-c-id");
			System.out.println("Att Value :"+att);
			
			String css=element.getCssValue("font-size");
			System.out.println("css Value :"+css);
			
			element.click();
			
			Thread.sleep(3000);
			
			
			
			driver.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
