package practicee;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {

	@Test
	public void Testing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdevkar\\eclipse-workspace\\SeleniumwithJmeter\\latest_chrome.exe\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://ebay.com");
		System.out.println(driver.getTitle());
	}
}
