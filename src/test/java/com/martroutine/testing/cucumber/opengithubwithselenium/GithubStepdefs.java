package com.martroutine.testing.cucumber.opengithubwithselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GithubStepdefs {

	private WebDriver driver;

	@Given("^I open a website name \"([^\"]*)\"$")
	public void I_open_a_website_name(String site) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(site);
	}

	@Then("^I quit a website")
	public void I_quit_a_website() {
		driver.quit();
	}

}
