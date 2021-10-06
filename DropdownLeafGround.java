package org.qeagle.train;

import java.awt.Window;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownLeafGround {
	
	public static void selectIndex(WebElement text, int value) {
		Select sc = new Select(text);
		sc.selectByIndex(value);
	}
	public static void selectText(WebElement text, String value) {
		Select sc = new Select(text);
		sc.selectByVisibleText(value);
	}
	public static void selectValue(WebElement text, String value) {
		Select sc = new Select(text);
		sc.selectByValue(value);
	}
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	WebElement find1 = driver.findElement(By.id("dropdown1"));
	selectIndex(find1, 1);
	WebElement find2 = driver.findElement(By.name("dropdown2"));
	selectText(find2, "Selenium");
	WebElement find3 = driver.findElement(By.id("dropdown3"));
	selectValue(find3, "1");
	
	List<WebElement> find4 = driver.findElements(By.xpath("//select[@class='dropdown']/option"));
	int size = find4.size();
	System.out.println("The size of the DropDown Options:"+size);
	
	WebElement find5 = driver.findElement(By.xpath("(//div[@class='example']/select)[5]/option"));
	find5.sendKeys("Sele",Keys.ENTER);
	
	driver.findElement(By.xpath("((//div[@class='example']/select)[6]/option)[1]")).click();
}
}
