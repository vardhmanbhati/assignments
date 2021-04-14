package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Signup {

	ChromeDriver driver;
	public void dropdown(WebElement element,String VisibleText) {
		
		Select s1=new Select(element);
		s1.selectByVisibleText(VisibleText);
	
	}

	Signup obj;
	    
	
	  @Before
	    public void before() {
		System.setProperty("webdriver.chrome.driver", "../selenium/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	    }
		
	    @Test
		public void test() throws InterruptedException {
		WebElement createaccount=driver.findElementByCssSelector("a[data-testid=\"open-registration-form-button\"]");
		createaccount.click();
		Thread.sleep(3000);
		WebElement fname=driver.findElementByName("firstname");
		fname.sendKeys("vardhman");
		WebElement surname=driver.findElementByName("lastname");
		surname.sendKeys("bhati");
		WebElement mobileno=driver.findElement(By.cssSelector("input[aria-label=\"Mobile number or email address\"]"));
		mobileno.sendKeys("8619102129");
		WebElement password=driver.findElementByCssSelector("input[aria-label='New password']");
		password.sendKeys("password");
		obj=new Signup();
		WebElement day=driver.findElementById("day");
		obj.dropdown(day,"5");
		
		
		WebElement Month=driver.findElementByCssSelector("select[title='Month']");
		obj.dropdown(Month,"Jan");
		
		WebElement year=driver.findElementByName("birthday_year");
		obj.dropdown(year,"1993");
		
		WebElement gender=driver.findElementByCssSelector("input[value='2']");
		gender.click();
		WebElement signup=driver.findElementByName("websubmit");
		signup.click();
		
		}
		
		@After
		public void bbrowserclose() {
			
			driver.close();
		}
		


	
	}


	

