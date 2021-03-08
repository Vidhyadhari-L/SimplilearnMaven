package Pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridConsole {
    public static void main(String[] args) throws MalformedURLException{

    	 

        
    DesiredCapabilities obj = new DesiredCapabilities();
    obj.setPlatform(Platform.LINUX);
    obj.setBrowserName("chrome");
    
    String HubURL = "http://localhost:4444/wd/hub";
         WebDriver driver = new RemoteWebDriver(new URL(HubURL),obj);
         driver.get("https://www.simplilearn.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
         
    
}

}
