package utility_package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base_Test {
	public WebDriver driver;
@BeforeClass
public void Browsersetup() throws IOException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.get(Utility_methods.test_configuration("url"));
}
@AfterClass
public void BrowserTearDown() {
	driver.close();
}
}
