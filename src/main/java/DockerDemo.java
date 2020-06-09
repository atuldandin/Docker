


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class DockerDemo {
	
	public WebDriver driver;


	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))  {
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("Remote")) {
			Capabilities capabilities = null;
			CommandExecutor remoteAddress = null;
			driver = new RemoteWebDriver(remoteAddress, capabilities);
		}else {
			System.out.println("Broswer not init");
			
		}
		
	
	}
	
	@Test
	public void login() {
		driver.get("https://www.facebook.com");
	}

}
