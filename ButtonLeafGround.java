package org.qeagle.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonLeafGround {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Button.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
	driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
	WebElement find1 = driver.findElement(By.xpath("//button[text()='Get Position']"));
	find1.getText();
	String value = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color:lightgreen");
	System.out.println(value);
	
}
}
