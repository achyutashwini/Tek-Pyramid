package SelectClassLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidingNotificationPopupInEaseMyTrip {
	public static void main(String[] args) {
		
		ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--enable-notifications");
		WebDriver driver=new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwyJqzBhBaEiwAWDRJVJ1bZ4J8dIrVZrWiHvIccpSz-NI8nhV7B02TvXzd3I2p3zEhn216TRoCWOsQAvD_BwE");
		
	}

}
