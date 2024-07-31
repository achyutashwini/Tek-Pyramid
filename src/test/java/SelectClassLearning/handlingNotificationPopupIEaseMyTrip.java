package SelectClassLearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingNotificationPopupIEaseMyTrip {
	public static void main(String[] args) throws AWTException, InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwyJqzBhBaEiwAWDRJVJ1bZ4J8dIrVZrWiHvIccpSz-NI8nhV7B02TvXzd3I2p3zEhn216TRoCWOsQAvD_BwE");
		Robot robot=new Robot();
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
}
	