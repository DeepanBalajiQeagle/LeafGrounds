package org.qeagle.train;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	

	//Selectable
	
	driver.get("http://www.leafground.com/pages/selectable.html");
	List<WebElement> find2 = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
	for (int i = 0; i < find2.size(); i++) {
		find2.get(i).click();
	}
}
}
