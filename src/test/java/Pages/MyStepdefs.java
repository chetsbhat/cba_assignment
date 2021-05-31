package Pages;

import Pages.Demo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Locale;

public class MyStepdefs  {
    public WebDriver driver;
    public Demo demo;

    @Given("^I launch the website$")

    public void iLaunchWebsite() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganap\\IdeaProjects\\Chaitra\\chromedriver.exe");
        driver=new ChromeDriver();
        demo=new Demo(driver);
        driver.get("https://www.commbank.com.au");
    }

    @When("^I click on Home loans$")
    public void iclickHomeLoans() throws IOException {
        demo.clickHomeLoans();
    }

    @Then("^I Click on Calculators and Tools$")
    public void iclickOnCalculator() throws IOException {
        demo.clickOnCalculator();
    }
    @Then("^I calculate Home loan repayment$")
    public void calculateRepayment() throws IOException{
        demo.calculateRepayment();
    }


    @Then("^I close the browser$")
    public void closeBrowser(){
        driver.quit();
    }
}
