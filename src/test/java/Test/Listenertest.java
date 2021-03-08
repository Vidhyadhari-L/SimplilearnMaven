package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(TestNGListener.class)

public class Listenertest {
	@Test
	public void LoginTest() {
		System.out.println("Inside Test");
		Assert.assertEquals("Hi", "Hi");
		
	}
	

}
