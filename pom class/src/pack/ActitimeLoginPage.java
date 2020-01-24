package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ActitimeLoginPage {
	//Declaration
	@FindBy(xpath="//input[@name='username']")
	private WebElement un;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	WebDriver driver;
	
	public ActitimeLoginPage(WebDriver driver) {
		// Initialization 
		this.driver = driver;
//		un = driver.findElement(By.xpath("//input[@name='username']"));
//		pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
//		login = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		PageFactory.initElements(driver, this);
	
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
	




