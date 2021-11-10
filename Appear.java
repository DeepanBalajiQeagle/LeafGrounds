package org.qeagle.train;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Appear {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/appear.html");
	Thread.sleep(2000);
	
	
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='flex']/button)[3]/b")));
	WebElement find = driver.findElement(By.xpath("(//div[@class='flex']/button)[3]/b"));
	String text = find.getText();
	System.out.println(text);
}
}
