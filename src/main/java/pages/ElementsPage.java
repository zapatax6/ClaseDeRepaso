package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
    WebDriver webDriverHome;

    public ElementsPage(WebDriver webDriverHome) {
        this.webDriverHome = webDriverHome;
    }
    private final String textBoxMenuOptionCSSLocator = ".element-list.collapse.show > ul > #item-0 > span";
    public WebElement getTextBoxMenuOption(){
        return webDriverHome.findElement(By.cssSelector(textBoxMenuOptionCSSLocator));

    }
}
