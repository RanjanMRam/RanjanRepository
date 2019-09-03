package CallingFunctionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import LibraryFunctionPackage.LibraryFile;

public class LoginLogout 
{
	public static void login(String Username,String Password)
	{
		LibraryFile.LaunchBroswerAndURL("Chrome", "http://automationpractice.com");	
		LibraryFile.ClickJSElementByXpath(By.xpath("//a[@class='login']"));
		LibraryFile.EnterKeysInTextbox(By.xpath("//input[@id='email']"),Username);
		LibraryFile.EnterKeysInTextbox(By.xpath("//input[@id='passwd']"),Password);
		LibraryFile.ClickJSElementByXpath(By.xpath("//button[@id='SubmitLogin']"));
	}
	public static void logout()
	{
		LibraryFile.ClickJSElementByXpath(By.xpath("//a[@class='logout']"));
		LibraryFile.CloseBrowser();
	}

	public static void frames()
	{   //Method to find iFrame//
		 LibraryFile.LaunchBroswerAndURL("Chrome", "http://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		 LibraryFile.ClickJSElementByXpath(By.xpath("//li[@id='Open New Tab']"));
		 LibraryFile.ClickElementByXpath(By.xpath("(//a[@class='button e.g. button_hilite button_pale small_button'])[1]"));
		 LibraryFile.SwitchToNewTab(1);
		 LibraryFile.ClickElementByXpath(By.xpath("//li[@id='iFrame']"));
		 int Size= LibraryFile.NoOfFrames();
		 LibraryFile.AllFrameNames();
         LibraryFile.SwitchToFrame("globalSqa");
 //      LibraryFile.ClickJSElementByXpath(By.xpath("(//div[@class='info_desc']//following::h3)[1]"));
         LibraryFile.ClickJSElementByXpath(By.xpath("//a[text()='Platform & Database Testing']"));
       //  D.switchTo().defaultContent();
  //     LibraryFile.ClickJSElementByXpath(By.xpath("//a[text()='Platform & Database Testing']"));
         LibraryFile.ClickJSElementByXpath(By.xpath("//li[@id='menu-item-2818']//child::a//child::span[text()='Sample Page Test']"));
		 
		 
	}
	public static void GoogleCurrencyCalculator() throws InterruptedException
	{
		LibraryFile.LaunchBroswerAndURL("Chrome", "https://www.google.co.in/");
		LibraryFile.EnterKeysInTextbox(By.xpath("//input[@title='Search']"),"1 USD to INR");
     	LibraryFile.Press_Enter(By.xpath("//input[@title='Search']")); 
		LibraryFile.SelectValuesfromDropDown(By.xpath("//select[@id='knowledge-currency__src-selector']"),"Australian Dollar");
		Thread.sleep(5000);
		LibraryFile.SelectValuesfromDropDown(By.xpath("//select[@id='knowledge-currency__tgt-selector']"),"Euro");
		Thread.sleep(5000);
		LibraryFile.EnterKeysInTextbox(By.xpath("//input[@id='knowledge-currency__src-input']"),"10");
		LibraryFile.Press_Enter(By.xpath("//input[@id='knowledge-currency__src-input']")); 
	}
	
	public static void StringSplit(String s)
	{
		String[] StringArray=s.split(",");
		for (String a: StringArray)
		{
			System.out.println(a);
		}
		
	}
     }


	
	

