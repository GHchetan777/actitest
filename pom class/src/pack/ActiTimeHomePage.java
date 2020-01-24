package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage {
	
	@FindBy(xpath="//img[@src='/img/default/top_nav/default-logo.png?hash=274618146']")
	private WebElement header;
	
	@FindBy(xpath="//*[@class=\"submit_tt myTT with-navigation  ext-chrome\"]")
	private WebElement logout;
	
	WebDriver driver;
	
	public ActiTimeHomePage(WebDriver driver) {
		this.driver = driver;
////		header = driver.findElement(By.xpath("//img[@src='/img/default/top_nav/default-logo.png?hash=274618146']"));
////		logout = driver.findElement(By.xpath("//*[@id=\"logoutLink\"]"));
		PageFactory.initElements(driver, this);
		
	}
	
	public void actitimeHomePageLogoutButton() {
		logout.click();
	}
	
	public void verifyActitimeHomePageHeaderDisplayed() {
		boolean result = header.isDisplayed();
		if(result == true) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
	}
}
