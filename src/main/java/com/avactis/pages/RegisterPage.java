package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By myAccountLink = By.linkText("My Account");
	
	By emailField = By.xpath("//input[@name='customer_info[Customer][Email]']");
	By passwordField = By.xpath("//input[@name='customer_info[Customer][Password]']");
	By confirmPasswordField = By.xpath("//input[@name='customer_info[Customer][RePassword]']");
    By firstNameField = By.xpath("//input[@name='customer_info[Customer][FirstName]']");
    By lastNameField = By.xpath("//input[@name='customer_info[Customer][LastName]']");
    By countryDropdawn= By.xpath("//*[@id=\"customer_info_Customer_Country\"]");
    By stateDropdawn= By.xpath("//*[@id=\"customer_info_Customer_State\"]");
    By zipCodeField=By.xpath("//input[@name='customer_info[Customer][ZipCode]']");
    By cityField=By.xpath("//input[@name='customer_info[Customer][City]']");
    By addressLine1Field=By.xpath("//input[@name='customer_info[Customer][Streetline1]']");
    By addressLine2Field=By.xpath("//input[@name='customer_info[Customer][Streetline2]']");
    By contactPhoneField=By.xpath("//input[@name='customer_info[Customer][Phone]']");
    
    By registerButton = By.xpath("//input[@value='Register']");
    
    
    public void clickMyAccount() {
    	driver.findElement(myAccountLink).click();
    }
    
    public void enterUserDetails(String email,
    						     String password,
    						     String confirmPassword,
    						     String firstName,
    						     String lastName,
    						     String country,
    						     String state,
    						     String zipCode,
    						     String city,
    						     String addressLine1,
    						     String addressLine2,
    						     String contactPhone) {
    	
    	driver.findElement(emailField).sendKeys(email);
    	driver.findElement(emailField).sendKeys(password);
    	driver.findElement(confirmPasswordField).sendKeys("confirmPassword");
    	driver.findElement(firstNameField).sendKeys(firstName);
    	driver.findElement(lastNameField).sendKeys(lastName);
    	driver.findElement(countryDropdawn).sendKeys(country);
    	driver.findElement(stateDropdawn).sendKeys(state);
    	driver.findElement(zipCodeField).sendKeys(zipCode);
    	driver.findElement(cityField).sendKeys(city);
    	driver.findElement(addressLine1Field).sendKeys(addressLine1);
    	driver.findElement(addressLine2Field).sendKeys(addressLine2);
    	driver.findElement(contactPhoneField).sendKeys(contactPhone);
    	
    }
    
    public void clickRegister() {
    	driver.findElement(registerButton).click();
    }
    
    
}