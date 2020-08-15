package DemoJenkingsTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoJenkins
{
	WebDriver driver;

@BeforeMethod
public void setUp() throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dfd\\Desktop\\Nishant_Desktop\\Selenium_Java_Assignments\\22February_Batch_Selenium\\chromedriver_win32_Latest_Version\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.manage().window().fullscreen();

	Thread.sleep(3000);

	driver.get("https://www.amazon.com");
	
	

}

@Test
public void mainTestMethod() throws InterruptedException
{
	Thread.sleep(3000);
	
	driver.navigate().to("https://www.youtube.com");
	String title=driver.getTitle();
	
	System.out.println("Title for the Page is "+title);
	
	Thread.sleep(3000);
	driver.navigate().back();
	
	Thread.sleep(3000);
	String titleNew=driver.getTitle();
	
	System.out.println("New Title of the Page is "+titleNew);

}

@AfterMethod
public void tearDown()
{

	driver.close();

}
	
}
