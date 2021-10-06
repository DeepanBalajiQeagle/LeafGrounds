package org.qeagle.train;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLeafGround {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Image.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following::img")).click();
	driver.findElement(By.xpath("//h5[text()='Image']/following::img")).click();
	
	//WebElement find1 = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following::img"));
	
	WebElement find1 = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following::img"));
	Actions ac= new Actions(driver);
	ac.doubleClick(find1).perform();
	
}
}
