package com.avactis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	By myAccounLink=By.linkText("My Account");

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickMyAccount() {
		driver.findElement(myAccounLink).click();
	}
}
