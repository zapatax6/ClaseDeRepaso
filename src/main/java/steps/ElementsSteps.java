package steps;

import org.openqa.selenium.WebDriver;
import pages.ElementsPage;

public class ElementsSteps extends BaseSteps {

    ElementsPage elementsPage = new ElementsPage(_webDriverBaseSteps);

    public ElementsSteps(WebDriver _webDriverBaseSteps) {
        super(_webDriverBaseSteps);
    }

    public String getElementTextOption(){
        return elementsPage.getTextBoxMenuOption().getText();
    }

}
