package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class add {
	static WebDriver driver;

	@Given("user should be in telecom homepage")
	public void user_should_be_in_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\user\\\\eclipse-workspace\\\\ragul\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");

	}

	@Given("User click the add customer")
	public void user_click_the_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();

	}

	
	 /* @When("User should provide valid details") 
	 public void user_should_provide_valid_details(io.cucumber.datatable.DataTable cus) {
	  List<List<String>> twodlist = cus.asLists(String.class);
	  System.out.println(twodlist);
	  driver.findElement(By.xpath("//label[text()='Done']")).click();
	  driver.findElement(By.id("fname")).sendKeys(twodlist.get(0).get(0));
	  driver.findElement(By.id("lname")).sendKeys(twodlist.get(1).get(1));
	  driver.findElement(By.id("email")).sendKeys(twodlist.get(2).get(2));
	  driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(twodlist.get(3).get(3));
	  driver.findElement(By.id("telephoneno")).sendKeys(twodlist.get(4).get(4));
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
	  
	  }
	 */

	@When("User should provide valid details")
	public void user_should_provide_valid_details(io.cucumber.datatable.DataTable cu) {
		List<Map<String, String>> twodmap = cu.asMaps(String.class, String.class);
        System.out.println(twodmap);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(twodmap.get(3).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(twodmap.get(0).get("lname"));
		driver.findElement(By.id("email")).sendKeys(twodmap.get(0).get("gmail"));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(twodmap.get(0).get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(twodmap.get(0).get("phone"));
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

	@Then("Customer id is generated")
	public void customer_id_is_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}

}
