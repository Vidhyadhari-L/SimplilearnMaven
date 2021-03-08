package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TDDExample {
//	@Test
//	public void testPageTitle() {
//		System.setProperty("webdriver.chromedriver.com","chromedriver");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.simplilearn.com/");
//		String actual_title=driver.getTitle();
//		String expected_title="World's #1 Online Bootcamp & Certification Course Provider | Simplilearn";
//		System.out.println(actual_title);
//		Assert.assertEquals(expected_title, actual_title);
//		
//		
//		
//		
//	}
	
	@Test
	public void addTest()
	{
		int result=this.addition(10,20);
		Assert.assertEquals(30, result);
		
		
	}
	

	public int addition(int a,int b) //test case passed
	{
		return a+b;
	}
//	public int addition(int a,int b) Test case failed
//	{
//		return 0;
//	}
	
	

}
