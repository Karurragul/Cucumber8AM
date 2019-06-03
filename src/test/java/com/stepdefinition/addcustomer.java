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
import io.cucumber.datatable.DataTable;

public class addcustomer {
	static WebDriver driver;
	@Given("User is in telecom homepage")
	public void user_is_in_telecom_homepage() {
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\ragul\\Selenium\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://www.demo.guru99.com/telecom/");
    
	}

	@Given("user click the add customer")
	public void user_click_the_add_customer() {
			driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	//***general
	@When("User provided valid detail")
	public void user_provided_valid_detail() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Ragul");
		driver.findElement(By.id("lname")).sendKeys("kumar");
		driver.findElement(By.id("email")).sendKeys("Ragul@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	//**********1Dimnensional list
	@When("User enters valid detail")
	public void user_enters_valid_detail(io.cucumber.datatable.DataTable dataTable) {
	    List<String> listeg = dataTable.asList(String.class);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(listeg.get(0));
		driver.findElement(By.id("lname")).sendKeys(listeg.get(1));
		driver.findElement(By.id("email")).sendKeys(listeg.get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(listeg.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(listeg.get(4));
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	//**********1Dimensional list
	
	//**********1Dimensional map
	@When("User enter valid detail")
	public void user_enter_valid_detail(DataTable cu) {
	    Map<String,String> mapeg = cu.asMap(String.class, String.class);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(mapeg.get("fnam"));
		driver.findElement(By.id("lname")).sendKeys(mapeg.get("lnam"));
		driver.findElement(By.id("email")).sendKeys(mapeg.get("mail"));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(mapeg.get("add"));
		driver.findElement(By.id("telephoneno")).sendKeys(mapeg.get("mobile"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	//**********1Dimensional map 
	 
	//**********scenario outline
	@When("User entered valid detail{string},{string},{string},{string},{string}")
	public void user_entered_valid_detail(String fname, String lname, String mail, String address, String mobile){
		
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	//**********scenario outline

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
	}


}
