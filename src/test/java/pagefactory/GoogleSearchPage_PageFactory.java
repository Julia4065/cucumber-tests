package pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage_PageFactory {

    @FindBy(name = "q")
    public WebElement searchField;

    @FindBy(css = "#appbar #result-stats")
    public WebElement searchResultNumber;

    WebDriver driver;

    public GoogleSearchPage_PageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
//        PageFactory.initElements(driver, this);
    }

    public void enterSeachString(String textToSearch) {
        searchField.sendKeys(textToSearch);
    }

    public void search(Keys key) {
        searchField.sendKeys(key);
    }
}
