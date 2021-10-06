package org.qeagle.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/radio.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//input[@class='myradio'])[1]")).click();
	boolean selected = driver.findElement(By.xpath("(//input[@name='news'])[2]")).isSelected();
	if (selected==true) {
		System.out.println("Its is Selected");
	}else {
		System.out.println("Its is not Selected");
	}
	boolean selected2 = driver.findElement(By.xpath("(//input[@name='age'])[2]")).isSelected();
	if (selected2==true) {
		System.out.println("the selected value is correct");
	}else {
		System.out.println("The Selected value is worng");
	}
}
}
