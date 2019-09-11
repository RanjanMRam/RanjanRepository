package EclipseGitJenkins.EclipseGitJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App 
{
	@Test
    public void automationfunc()
    {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");	
      WebDriver driver=new ChromeDriver();
      driver.get("http://automationpractice.com");
      driver.manage().window().maximize();
      driver.findElement(By.cssSelector("a.login")).click();
      driver.findElement(By.cssSelector("input#email")).sendKeys("ranjanmr1989@gmail.com");
      driver.findElement(By.cssSelector("input#passwd")).sendKeys("rmnajnar");
      driver.findElement(By.cssSelector("button#SubmitLogin")).click();
      driver.findElement(By.cssSelector("a.logout")).click();
      driver.close();
    }
}
