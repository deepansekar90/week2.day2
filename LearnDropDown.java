package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// By Index
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select drop = new Select(dropdown1);
		drop.selectByIndex(1);

		// By Visible Text
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select drop2 = new Select(dropdown2);
		drop2.selectByVisibleText("Appium");

		// By Value
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(dropdown3);
		drop3.selectByValue("3");
	}

}
