package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Generic_Scripts.Base_Page;

public class Launch_Facebook extends Base_Page{
	@FindBy(id="email")
	private WebElement text_un;

	@FindBy(id="pass")
	private WebElement text_pass;

	@FindBy(xpath="//button[@name='login']")
	private WebElement button;



	public Launch_Facebook(WebDriver driver)
	{
		super(driver);
	}


	public void EnterUN()
	{
		text_un.sendKeys("fathimapatil6677@gmail.com");
		
	}

	public void EnterPwd()
	{
		text_pass.sendKeys("ShaikAbdulPatil@6677");
	}

	public void LoginButton()
	{
		button.click();
	}
	}



