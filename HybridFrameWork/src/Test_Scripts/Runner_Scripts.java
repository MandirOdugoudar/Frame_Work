package Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Runner_Scripts {
@Test
public void test1()
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.google.com");
}
}
