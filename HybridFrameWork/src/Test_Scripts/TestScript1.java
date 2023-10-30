package Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Scripts.GenericScript_Before_After;
import POM_Scripts.Launch_Facebook;


public class TestScript1 extends GenericScript_Before_After {

@Test(dataProvider="testData")
public void run()
{
	Launch_Facebook p=new Launch_Facebook(driver);
			p.EnterUN();
			p.EnterPwd();
			p.LoginButton();
			Assert.fail();
}
//@DataProvider(name="testData")
//public Object[][]createData1(){
//	return new Object[][]{
//		{"Cedric", "admin"},
//		{"Anne"},{"manager"},
//	
//	
//};


}
