package org.qeagle.train;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafground {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("DeepanBalaji@qeagle.com");
	WebElement find1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	find1.clear();
	find1.sendKeys("Ab",Keys.TAB);
	String text = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getText();
	System.out.println("The Default text in the box:"+text);
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
	boolean displayed = driver.findElement(By.xpath("//input[@disabled='true']")).isDisplayed();
	System.out.println(displayed);
	driver.close();
}
}
