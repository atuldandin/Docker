
package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class DockerDemo {
	
	public WebDriver driver;


	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) throws MalformedURLException {
		String Node = "https://localhost:4466/wd/hub";
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			//driver = new RemoteWebDriver(new URL(Node),cap);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul Dandin\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))  {
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			//driver = new RemoteWebDriver(new URL(Node),cap);
		}else {
			System.out.println("Broswer not init");
			
		}
		
	
	}
	
	@Test
	public void login() {
		driver.get("https://www.facebook.com");
	}

	
	@AfterClass
	public void quit() {
		driver.quit();
	}
}
