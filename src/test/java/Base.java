import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    private String chromePath = "C:\\Users\\zapat\\Documents\\Repos\\QAML_git_2022\\chromedriver_win32\\chromedriver.exe";

    public WebDriver _webDriver = getDriverObj();

    @BeforeTest
    public void setUp(){
        _webDriver.get("https://demoqa.com/");
        _webDriver.manage().window().maximize();
    }
    @AfterTest
    public void after(){
        _webDriver.quit();
        //_webDriver.manage().window().maximize();
    }

    private WebDriver getDriverObj(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver", chromePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,options);
        options.merge(desiredCapabilities);
        return new ChromeDriver(options);


    }
}
