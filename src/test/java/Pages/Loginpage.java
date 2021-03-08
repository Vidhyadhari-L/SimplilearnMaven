package Pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Loginpage {
    WebDriver driver;
    
    @FindBy(linkText="Log in")
    WebElement lnkLogin;
    
    
    @FindBy(name="user_login")
    WebElement editUserName;
    
    @FindBy(name="user_pwd")
    WebElement editPwd;
    
    @FindBy(className="rememberMe")
    WebElement chkBox;
    
    @FindBy(name="btn_login")
    WebElement btnPwd;
    
    
    public Loginpage(WebDriver testdriver) 
    {
        this.driver=testdriver;
        PageFactory.initElements(driver,this);
    }
    
    public void Login(String UserName,String password) {
        
        //WebElement lnkLogin=driver.findElement(By.linkText("Log in"));
        
        lnkLogin.click();
        
        //WebElement editUserName=driver.findElement(By.name("user_login"));
        editUserName.sendKeys(UserName);
        
      //  WebElement editPwd=driver.findElement(By.name("user_pwd"));
        editPwd.sendKeys(password);
        
      //  WebElement btnPwd=driver.findElement(By.name("btn_login"));
        btnPwd.click();
    }
    
    
    
    
 
}