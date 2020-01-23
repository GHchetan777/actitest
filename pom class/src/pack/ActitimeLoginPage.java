package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ActitimeLoginPage {
	//Declaration
	private WebElement un;
	private WebElement pwd;
	private WebElement login;
	WebDriver driver;
	
	public ActitimeLoginPage(WebDriver driver) {
		// Initialization 
		this.driver = driver;
		un = driver.findElement(By.xpath("//input[@name='username']"));
		pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		login = driver.findElement(By.xpath("//div[text()='Login ']"));
	
	}
	
	public void setActitimeLoginpageUserName() {
		un.sendKeys("admin");
	}
	
	public void setActitimeLoginpageUserPassword() {
		
		pwd.sendKeys("manager");
	}
	
	public void setActitimeLoginpageLoginButton() {
		login.click();
		
	}
	
	
	}
	




