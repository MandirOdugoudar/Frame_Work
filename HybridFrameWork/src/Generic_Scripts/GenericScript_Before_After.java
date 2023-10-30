package Generic_Scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript_Before_After implements FrameWorkConst {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(Chrome_Key, Chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	@AfterMethod
	public void closeAppl(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			GenericScript_Screenshot.getPhoto(driver);
		}
		driver.close();
	}
}


