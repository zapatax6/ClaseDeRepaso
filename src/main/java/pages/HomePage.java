package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage {

    WebDriver webDriverHome;

    public HomePage(WebDriver webDriverHome){
        this.webDriverHome = webDriverHome;
    }

    private final String menuListCSSSelector = ".card-up";
    public List<WebElement> getMenuList(){
        return webDriverHome.findElements(By.cssSelector(menuListCSSSelector));
    }

}
