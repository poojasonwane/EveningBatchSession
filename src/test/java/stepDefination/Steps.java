package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps 
{
	WebDriver driver;
	
	@Given("User is on the login Page")
	public void user_is_on_the_login_page()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    System.out.println("Browser setup completed");
	}

	@When("User enters valid username {string}")
	public void user_enters_valid_username(String uname) 
	{
		WebElement username = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		username.sendKeys(uname);
	}

	@When("User enters valid password {string}")
	public void user_enters_valid_password(String pwd) 
	{
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));		
		password.sendKeys(pwd);
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button()
	{

		WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginbtn.click();
	}

	@Then("User should navigate to the home page")
	public void user_should_navigate_to_the_home_page() 
	{
		String expectedResult = "Automation Exercise";
		String actualResult = driver.getTitle();
		System.out.println(actualResult);
		
		Assert.assertEquals(actualResult,expectedResult);
	}

}
