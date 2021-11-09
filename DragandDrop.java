package org.qeagle.train;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	String tag1="http://www.leafground.com/pages/drag.html";
	//Drag and Drop
	driver.get(tag1);
	driver.manage().window().maximize();
	WebElement find1 = driver.findElement(By.id("draggable"));
	Actions acc = new Actions(driver);
	acc.dragAndDropBy(find1, 100,100).build().perform();
	driver.close();
	
	
	
	
	
	
	
	
}
}
