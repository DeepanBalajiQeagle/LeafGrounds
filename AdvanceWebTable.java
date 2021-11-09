package org.qeagle.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceWebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		String give = null;
		String give1 = null;
		ArrayList<String> li = new ArrayList<String>();
		List<WebElement> find = driver.findElements(By.xpath("//table[@id='table_id']//tr/td"));
		for (WebElement web : find) {
			String text = web.getText();
			give = text;
		}
		li.add(give);
		Collections.sort(li);

		driver.findElement(By.xpath("(//table[@id='table_id']//tr/th)[2]")).click();

		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='table_id']//tr/td"));
		for (WebElement web1 : findElements) {
			String text1 = web1.getText();
			give1=text1;
			}
		if (li.equals(give1)) {
			System.out.println("Both are Equals");
		}else {
			System.out.println("Both are not Equals");
		}
	}
}
