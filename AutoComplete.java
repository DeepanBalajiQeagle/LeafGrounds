package org.qeagle.train;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/autoComplete.html");
	WebElement find = driver.findElement(By.id("tags"));
	find.sendKeys("Sel");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[text()='Selenium'])[1]")).click();
}
}
