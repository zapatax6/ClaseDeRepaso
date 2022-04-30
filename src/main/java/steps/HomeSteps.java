package steps;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomeSteps extends BaseSteps {
    HomePage homePage = new HomePage(_webDriverBaseSteps);

    public HomeSteps(WebDriver webDriverSteps) {
        super(webDriverSteps);
    }
    public void clickOption(int index){
        System.out.println(homePage.getMenuList().size());
        homePage.getMenuList().get(index).click();
    }

}
