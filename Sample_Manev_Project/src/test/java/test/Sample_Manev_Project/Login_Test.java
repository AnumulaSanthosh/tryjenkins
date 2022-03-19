package test.Sample_Manev_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility_package.Base_Test;
import utility_package.Utility_methods;

public class Login_Test extends Base_Test {
	@Test
   public void TC_001() throws IOException {
		 Utility_methods.Click_Element(driver.findElement(By.xpath("//a[@href='/login']")));
			Utility_methods.Enter_value_in_Edit_Field(driver.findElement(By.xpath("//input[@class='email']")), Utility_methods.test_configuration("email"));
			Utility_methods.Enter_value_in_Edit_Field(driver.findElement(By.xpath("//input[@name='Password']")), Utility_methods.test_configuration("password"));
		    Utility_methods.Click_Element(driver.findElement(By.xpath("//input[@value='Log in']")));
			
	}

}
