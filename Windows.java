package org.qeagle.train;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Window.html");
	 driver.manage().window().maximize();
	 
	 WebElement find = driver.findElement(By.id("home"));
	 find.click();
	 
	 WebElement find1 = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
	 find1.click();
	 Set<String> winhan = driver.getWindowHandles();
	 List<String> li = new ArrayList<String>(winhan);
	 int size = li.size();
	 System.out.println(size);
	 
	 WebElement find2 = driver.findElement(By.xpath("//button[text()='Do not close me ']"));
	 find2.click();
	 
	 
	  WebDriverWait wait = new WebDriverWait(driver, 5);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Wait for 5 seconds']")));
	  driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
	  
	 // driver.quit();
}
}
