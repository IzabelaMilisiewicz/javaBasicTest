import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirefoxTest {
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "./src/test/java/data/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void testChrome(){
        driver.get("http://google.com");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
