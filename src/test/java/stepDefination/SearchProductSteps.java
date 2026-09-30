package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps 
{
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("User is on the Automation Exercise homepage")
	public void user_is_on_the_automation_exercise_homepage() 
	{
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     driver.get("https://automationexercise.com/");
	     
	     Assert.assertTrue(
	             driver.getTitle().contains("Automation Exercise")
	         );
	}

	@When("User clicks on products")
	public void user_clicks_on_products() 
	{
		 driver.findElement(By.xpath(
		            "//a[@href='/products']"
		        )).click();

		        wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.id("search_product")
		        ));
	}

	@When("Users enters {string} in the search box")
	public void users_enters_in_the_search_box(String product) 
	{
		 driver.findElement(By.id("search_product"))
         .sendKeys(product);
	}
	   

	@When("User clicks search button")
	public void user_clicks_search_button() 
	{
	    driver.findElement(By.id("submit_search")).click();
	}

	@Then("Matching products should be displayed")
	public void matching_products_should_be_displayed() 
	{
		  wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//*[contains(text(),'Searched Products')]")
		        ));

		        Assert.assertTrue(
		            driver.findElements(By.cssSelector(".product-image-wrapper"))
		                  .size() > 0
		        );
	
	}
/*
	@Given("User is on the Products page")
	public void user_is_on_the_products_page() 
	{
	   
	}

	@When("User searches for {string}")
	public void user_searches_for(String string) 
	{
	 
	}

	@Then("Relevant products should be displayed")
	public void relevant_products_should_be_displayed() 
	{
	    
	}

	@When("User Searches for {string}")
	public void user_searches_for(String string) 
	{
	    
	}

	@Then("No Matching products should be displayed")
	public void no_matching_products_should_be_displayed() 
	{
	   
	}

	@Given("User  is on the Products page")
	public void user_is_on_the_products_page() 
	{

	}

	@When("User clicks on search without entering a product")
	public void user_clicks_on_search_without_entering_a_product() 
	{
	   
	}

	@Then("Search should not return a matching product list")
	public void search_should_not_return_a_matching_product_list()
	{
	   
	}

	@Then("Product name and price should be displayed")
	public void product_name_and_price_should_be_displayed() 
	{
	   
	}
*/
}
