package utility_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_methods {
public static String test_configuration(String key) throws IOException {
	
		File fi=new java.io.File("./test_configuraction/config.properties");
		FileInputStream file=new FileInputStream(fi);
		Properties pro=new Properties();
		pro.load(file);
		String value=pro.getProperty(key);
return value;	
}
public static void Enter_value_in_Edit_Field(WebElement element,String value) {
	element.sendKeys(value);
}
public static void Click_Element(WebElement element) {
	element.click();
}
public static void selectelementIndex(WebElement Element,int index) {
	Select select =new Select(Element);
	select.selectByIndex(index);		
}
public static void selectelementText(WebElement Element,String text) {
	Select select =new Select(Element);
	select.selectByVisibleText(text);	
}
public static void selectelementValue(WebElement Element,String text) {
	Select select =new Select(Element);
	select.selectByValue(text);	
}
public static void Action_movetoElement(WebDriver driver,WebElement Element) {
	Actions act=new Actions(driver);
	act.moveToElement(Element).click().perform();		
}
public static void Action_doubleClick(WebDriver driver,WebElement Element) {
	Actions act=new Actions(driver);
	act.doubleClick(Element).click().perform();		
}
public static void Action_contextClick(WebDriver driver,WebElement Element) {
	Actions act=new Actions(driver);
	act.contextClick(Element).click().perform();		
}
public static void Action_dragAndDrop(WebDriver driver,WebElement SourceElement,WebElement targetElement) {
	Actions act=new Actions(driver);
	act.dragAndDrop(SourceElement, targetElement).click().perform();		
}
public static void Action_(WebDriver driver,WebElement SourceElement,int i) {
	Actions act=new Actions(driver);
	for(int j=0;j<=i;i++) {
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}		
}
public static List<WebElement> getAllOptionsAvaliable(WebElement element) {
	
	Select s = new Select(element);
	return s.getOptions();
}
public static void KeyboardButtonDown(WebDriver driver, Keys key) {
	
	Actions act = new Actions(driver);
	act.keyDown(key).build().perform();
}
public static void KeyboardButtonUp(WebDriver driver, Keys key) {
	
	Actions act = new Actions(driver);
	act.keyUp(key).build().perform();
}
}
