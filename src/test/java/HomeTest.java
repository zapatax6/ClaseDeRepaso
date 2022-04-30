import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import steps.HomeSteps;

public class HomeTest extends Base{
    HomeSteps homeSteps = new HomeSteps(_webDriver);

    @Test
    public void testTextBoxOption(){
        homeSteps.clickOption(0);

    }
}
