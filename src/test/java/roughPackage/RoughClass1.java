package roughPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoughClass1 {

	public WebDriver driver;

	@Test
	public void test1() {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
