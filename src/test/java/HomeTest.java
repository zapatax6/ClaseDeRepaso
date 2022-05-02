import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.ElementsSteps;
import steps.HomeSteps;

public class HomeTest extends Base{
    HomeSteps homeSteps = new HomeSteps(_webDriver);
    ElementsSteps elementsSteps = new ElementsSteps(_webDriver);

    @Test
    public void testTextBoxOption(){
        homeSteps.clickOption(0);
        System.out.println(elementsSteps.getElementTextOption());
        Assert.assertEquals(elementsSteps.getElementTextOption(),"Text Box");

    }
}
