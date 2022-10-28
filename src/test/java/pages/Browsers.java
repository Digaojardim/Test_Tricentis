package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browsers  {
	


    protected static WebDriver driver;
	
	public void acessarSite(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe.");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
		}catch (Exception e) {
			System.err.println("--------- erro ao abrir navegador --------" + e.getMessage());
			System.err.println("--------- causa do erro --------" + e.getCause());
			
			
		}
	
	}

}
