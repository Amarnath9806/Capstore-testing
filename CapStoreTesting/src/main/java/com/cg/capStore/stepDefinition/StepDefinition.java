package com.cg.capStore.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	WebDriver driver;
	@Given("^user is in home page$")
	public void user_is_in_home_page()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMAR\\eclipse-workspace\\CapStoreTesting\\src\\main\\java\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://localhost:4200/");
		
	}

	@When("^title of home page is$")
	public void title_of_home_page_is()  {
		String title=driver.getTitle();
		Assert.assertEquals("Capstore", title);
		   
	}

	@Then("^click on Admin Login$")
	public void click_on_Admin_Login() throws InterruptedException  {
		Thread.sleep(2000);
		WebElement loginbtn = driver.findElement(By.id("admin"));
		loginbtn.click();

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException  {
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		Thread.sleep(2000);
	   WebElement username =driver.findElement(By.name("uname"));
	   username.sendKeys("admin");
	   Thread.sleep(1000);
	   WebElement pass =driver.findElement(By.name("pass"));
	   pass.sendKeys("password");
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws InterruptedException  {
		Thread.sleep(1000);
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
	}

	@When("^title of admin home page is$")
	public void title_of_admin_home_page_is() {
		String title=driver.getTitle();
		Assert.assertEquals("Capstore", title);
		   
	}

	@Then("^click on refund details$")
	public void click_on_refund_details() throws InterruptedException {
		Thread.sleep(2000);
		WebElement loginbtn = driver.findElement(By.id("refund"));
		loginbtn.click();
	}

	@When("^title of refund page is$")
	public void title_of_refund_page_is()  {
		String title=driver.getTitle();
		Assert.assertEquals("Capstore", title);
		   
	}

	@Then("^click on pending refunds$")
	public void click_on_pending_refunds() throws InterruptedException  {
		Thread.sleep(2000);
		WebElement pending = driver.findElement(By.name("pending"));
		pending.click();
		Thread.sleep(3000);
		
		
	}

	@Then("^click on refund$")
	public void click_on_refund() throws InterruptedException  {
		WebElement refund = driver.findElement(By.name("refund"));
		refund.click();
		Thread.sleep(1000);
		WebElement pending1 = driver.findElement(By.name("pending"));
		pending1.click();
		
	}

	@Then("^click on Refunded$")
	public void click_on_Refunded() throws InterruptedException  {
		Thread.sleep(2000);
		WebElement refunded = driver.findElement(By.name("refunded"));
		refunded.click();
		Thread.sleep(3000);
		WebElement refunded1 = driver.findElement(By.name("refunded"));
		refunded1.click();
		driver.close();
		
	}

}
