package org.qeagle.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/mouseOver.html");
	WebElement find = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
	Actions acc = new Actions(driver);
	acc.moveToElement(find).perform();
}
}
