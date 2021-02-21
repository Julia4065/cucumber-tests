package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.GoogleSearchPage_PageFactory;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchSteps_PageFactory {

    WebDriver webDriver = null;
    GoogleSearchPage_PageFactory googleSearchPage_pageFactory;

    @Before()
//здесь то что в set up
    public void browserSetup() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @After
//    здесь то что tearDown
    public void tearDown(Scenario scenario) {
        System.out.println("hey hey");

        try {
            if (scenario.isFailed()) {
                Allure.addAttachment("Screenshot on failure ", new ByteArrayInputStream(((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES)));
            }
            Allure.addAttachment("test", "test2");
        } finally {
            webDriver.close();
            webDriver.quit();
        }
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        Allure.getLifecycle().updateStep((x) -> {
            x.setName("TESTINGGGGGGGGGG");
        });
    }


    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        webDriver.navigate().to("https://google.com");
    }


    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        googleSearchPage_pageFactory = new GoogleSearchPage_PageFactory(webDriver);
        googleSearchPage_pageFactory.enterSeachString("Automation step by step");
    }


    @When("hits enter")
    public void hits_enter() {
        googleSearchPage_pageFactory.search(Keys.ENTER);
    }

    @When("hits tab")
    public void hits_tab() {
        googleSearchPage_pageFactory.search(Keys.TAB);
    }


    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        assertThat(webDriver.getPageSource()).contains("Online Courses");
    }


    @Then("^number of search result is \"([^\"]*)\"$")
    public void number_of_search_result_is(String expectedNumber) {
        String actualNumber = googleSearchPage_pageFactory.searchResultNumber.getText().split(":")[1].trim().split(" \\(")[0];
        assertThat(actualNumber).isEqualTo(expectedNumber);
    }
}