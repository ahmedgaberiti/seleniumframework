package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utility.Helper;

public class TestBase extends AbstractTestNGCucumberTests {

	public static WebDriver driver ;

	@BeforeSuite
	@Parameters({"browser"}) // to do cross browser testing and optional to run every test case alone 
	public void startdriver(@Optional("chrome") String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/uploads/chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/");
	}

	@AfterSuite
	public void stopdriver() {
		driver.quit();

	}
	
	
	@AfterMethod
	public void screenshotonfailure(ITestResult result) {
		
		if(result.getStatus() ==ITestResult.FAILURE) {
			System.out.println("Failed !");
			System.out.println("taking screenshot .. ");
			Helper.capturescreenshoot(driver, result.getName());
		}
		
	}












}
