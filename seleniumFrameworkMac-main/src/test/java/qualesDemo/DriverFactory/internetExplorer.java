package qualesDemo.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetExplorer {

	public static WebDriver open (){

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//drivers//chromedriver89");
			 return  new InternetExplorerDriver();
			
		}
		
		
	}


