package example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\gecko1\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
			driver.get("https://www.google.co.in/");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.quit();
	}

}
