package org.qeagle.train;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.leafground.com/pages/checkbox.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	
	WebElement find1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
	boolean selected = find1.isSelected();
	System.out.println(selected);
	
	WebElement find2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
	find2.click();
	
	List<WebElement> find3 = driver.findElements(By.xpath("(//div[@class='example'])[4]//following::div"));
	for (int i = 0; i < find3.size(); i++) {
	     find3.get(i).click();
	}

}
}
