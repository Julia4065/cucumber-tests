package StepDefinitions;//package StepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages.GoogleSearchPage;
//
//public class GoogleSearchSteps {
//
//    WebDriver webDriver = null;
//    GoogleSearchPage googleSearchPage;
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        webDriver = new ChromeDriver();
////        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//
////        webDriver.manage().window().maximize();
//    }
//
//    @And("user is on google search page")
//    public void user_is_on_google_search_page() {
//        webDriver.navigate().to("https://google.com");
//    }
//
//    @When("user enters a text in search box")
//    public void user_enters_a_text_in_search_box() {
//        googleSearchPage = new GoogleSearchPage(webDriver);
//        googleSearchPage.enterSeachString("Automation step by step");
//    }
//
//    @When("hits enter")
//    public void hits_enter() {
//        googleSearchPage = new GoogleSearchPage(webDriver);
//        googleSearchPage.search(Keys.ENTER);
//    }
//
//    @Then("user is navigated to search results")
//    public void user_is_navigated_to_search_results() {
//        webDriver.getPageSource().contains("Online Courses");
//
//        webDriver.close();
//        webDriver.quit();
//    }
//}
