package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActitimeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chetan\\Desktop\\class\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().setPosition(new Point(0,-2000));
		
		//objection creation of pom class
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		
		
		//nevigation setps of test case
		
		login.setActitimeLoginpageUserName();
		login.setActitimeLoginpageUserPassword();
		login.setActitimeLoginpageLoginButton();
		
		ActiTimeHomePage home=new ActiTimeHomePage(driver);
		home.verifyActitimeHomePageHeaderDisplayed();
		home.actitimeHomePageLogoutButton();
		
		//driver.close();
		//driver.manage().window().maximize();
		
		
	}

}
