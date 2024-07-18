package Testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Signup {
public String baseUrl="https://www.safearth.in/";
public WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(baseUrl);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@Test(priority=1)
public void Signup1() throws InterruptedException{
	 String tagName = "button"; 
     java.util.List<WebElement> elements = driver.findElements(By.tagName(tagName));
     for (int i = 0; i < elements.size(); i++) {
         WebElement element = elements.get(i);
         System.out.println("Index: " + i + ", Text: " + element.getText());
     }
     
     if (elements.size() >= 7) {
         WebElement first = elements.get(1); 
         System.out.println("1st occurrence found: " + first.getText());
         first.click(); 
     } else {
         System.out.println("1th occurrence not found.");
     }
	String tagname1="h3";
	java.util.List<WebElement> elements1 = driver.findElements(By.tagName(tagname1));
	//for (int i = 0; i < elements1.size(); i++) {
        //WebElement element3 = elements1.get(i);
        //System.out.println("Index: " + i + ", Text: " + element3.getText());
    //}
	if(elements1.size()>3) {
		WebElement e1=elements1.get(3);
		e1.click();
		driver.findElement(By.xpath("(//div[@class='ant-row ant-row-middle user-wrapper'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Arpitha_test");
		driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("demo_test");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("6523564585");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arpithakotiyan20@gmail.com");
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default get-otp-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("");//you need third party applications to fetch an email otp
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default signup-btn']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("solar1234");
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("solar1234");
	}}
@Test
public void Login() {
	String TagName="button";
	java.util.List<WebElement> element1=driver.findElements(By.xpath("//button[normalize-space()='Login']"));
	//for(int i=0;i<element1.size();i++) {
		//WebElement ele=element1.get(i);
	element1.get(0).click();
	//System.out.println("Index: " + i + ", Text: " + ele.getText());
	//input[@id='login-form_email']
	driver.findElement(By.xpath("//input[@id='login-form_email']")).sendKeys("cifiv97844@evvgo.com");
	driver.findElement(By.xpath("//input[@id='login-form_password']")).sendKeys("solar1234");
	driver.findElement(By.xpath("//span[@class='ant-checkbox-inner']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		}
@Test
	public void SolarflowProject() throws InterruptedException {
	String TagName="button";
	java.util.List<WebElement> element1=driver.findElements(By.xpath("//button[normalize-space()='Login']"));
	element1.get(0).click();
	driver.findElement(By.xpath("//input[@id='login-form_email']")).sendKeys("cifiv97844@evvgo.com");
	driver.findElement(By.xpath("//input[@id='login-form_password']")).sendKeys("solar1234");
	driver.findElement(By.xpath("//span[@class='ant-checkbox-inner']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//div[@class='dashboard-card-wrapper my-projects-wrapper']//button[@type='button']")).click();
}




	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}



