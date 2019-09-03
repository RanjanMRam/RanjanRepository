package LibraryFunctionPackage;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibraryFile {
	
	public static WebDriver driver;
	public static WebDriver LaunchBroswerAndURL(String Browser,String URL)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();  
		}
		else if(Browser.equalsIgnoreCase("Internet Explorer"))
		{
			System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;		
		
	}
	
	public static void ClickElementByXpath(By XPATH)
	{
	    WebDriverWait wait=new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.elementToBeClickable(XPATH));
		driver.findElement(XPATH).click();
	}
	
	public static void Press_Enter(By XPATH)
	{
		WebDriverWait wait=new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.elementToBeClickable(XPATH));
	    driver.findElement(XPATH).sendKeys(Keys.ENTER);	
	}
	
	public static void ClickJSElementByXpath(By XPATH)
	{
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(XPATH));
		JavascriptExecutor jt = (JavascriptExecutor)(driver);
		jt.executeScript("arguments[0].click();", driver.findElement(XPATH));
	}
	
	public static void EnterKeysInTextbox(By XPATH,String text)
	{
	 WebDriverWait wait=new WebDriverWait(driver,60);
	 wait.until(ExpectedConditions.elementToBeClickable(XPATH));
     driver.findElement(XPATH).clear();
	 driver.findElement(XPATH).sendKeys(text);
	}
	
	public static void SelectValuesfromDropDown(By XPATH,String Name)
	{
		
		Select S=new Select(driver.findElement(XPATH));
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(XPATH));
		S.selectByVisibleText(Name);
		
	}
	
	public static void CloseBrowser()
	{	
	  driver.close();	
	}
	
	
	public static void SwitchToNewTab(int tabNumber)
	{	
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(tabNumber));
		
	}
	
	public static void SwitchToFrame(String FrameIDorName)
	{
		driver.switchTo().frame(FrameIDorName);
		
	}
	
	public static int NoOfFrames()
	{
		System.out.println("Total Number Of Frames in the System is" +driver.findElements(By.tagName("iframe")).size());
		return driver.findElements(By.tagName("iframe")).size();
	}
	
	public static void AllFrameNames()
	{
		
		List <WebElement> L = driver.findElements(By.tagName("iframe"));
		for(WebElement L1:L)
		{
			System.out.println(L1.getAttribute("name"));
		}
		
	}
	
	
	
	
}
