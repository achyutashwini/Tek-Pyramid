package SelectClassLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSimpleAlertInSBIOnline2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Actions actions = new Actions(driver);
		WebElement homelink = driver.findElement(By.partialLinkText("Home"));
		actions.contextClick(homelink);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

}
