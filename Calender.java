package org.qeagle.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Calendar.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("datepicker")).click();
	WebElement find1 = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
	find1.findElement(By.xpath("(//td[@data-handler='selectDay'])[10]")).click();
}
}
