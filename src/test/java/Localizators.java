import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Localizators {
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./src/test/java/data/chromedriver");
        driver = new ChromeDriver();
    }

//    @Test
//    public void testForm(){
//        String fullName = "Ania Bania";
//        String userEmail = "aniabania@emailad.pl";
//        String currentAddress = "ul. Cicha 56, Szczebrzeszyn";
//        String permanentAddress = "ul. Burgundowa 45, Opalenica";
//
//        driver.get("https://demoqa.com/text-box");
//        WebElement input1 = driver.findElement(By.id("userName"));
//        WebElement input2 = driver.findElement(By.id("userEmail"));
//        WebElement input3 = driver.findElement(By.id("currentAddress"));
//        WebElement input4 = driver.findElement(By.id("permanentAddress"));
//        WebElement button = driver.findElement(By.id("submit"));
//        input1.sendKeys(fullName);
//        input2.sendKeys(userEmail);
//        input3.sendKeys(currentAddress);
//        input4.sendKeys(permanentAddress);
//        button.click();
//
//        Assert.assertTrue(driver.findElement(By.id("name")).getText().contains(fullName));
//        Assert.assertTrue(driver.findElement(By.id("email")).getText().contains(userEmail));
//        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='currentAddress']")).getText().contains(currentAddress));
//        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText().contains(permanentAddress));
//    }
//
//    @Test
//    public void testForm2(){
//        String firstName = "Ania";
//        String lastName = "Bania";
//        String userEmail = "aniabania@emailad.pl";
//        String userMobile = "1234567890";
//
//        driver.get("https://demoqa.com/automation-practice-form");
//
//        driver.findElement(By.id("firstName")).sendKeys(firstName);
//        driver.findElement(By.id("lastName")).sendKeys(lastName);
//        driver.findElement(By.id("userEmail")).sendKeys(userEmail);
//        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]")).click();
//        driver.findElement(By.id("userNumber")).sendKeys(userMobile);
//        driver.findElement(By.id("userNumber")).submit();
//
//        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("example-modal-sizes-title-lg"))));
//        Assert.assertEquals(driver.findElement(By.id("example-modal-sizes-title-lg")).getText(), "Thanks for submitting the form");
//
//    }

    @Test
    public void testAjax(){
        driver.get("https://www.w3schools.com/js/js_ajax_intro.asp");
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body[1]/div[7]/div[1]/div[1]/div[4]/div[1]/div[1]/p[1]"))));
        driver.findElement(By.id("accept-choices")).click();
        driver.findElement(By.tagName("button")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body[1]/div[7]/div[1]/div[1]/div[4]/div[1]/div[1]/p[1]"))));
        Assert.assertTrue(driver.findElement(By.xpath("//body[1]/div[7]/div[1]/div[1]/div[4]/div[1]/div[1]/p[1]")).getText().contains("AJAX is not a programming language."));

    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
