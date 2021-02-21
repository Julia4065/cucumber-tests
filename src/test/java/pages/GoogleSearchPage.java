package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
    protected WebDriver driver;

    private By searchField = By.name("q");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        if(!driver.getTitle().equals("Google")) {
            throw new IllegalStateException("This is not google page. This is " + driver.getCurrentUrl());
        }
    }

    public void enterSeachString(String textToSearch) {
        driver.findElement(searchField).sendKeys(textToSearch);
    }

    public void search(Keys key) {
        driver.findElement(searchField).sendKeys(key);
    }

}
