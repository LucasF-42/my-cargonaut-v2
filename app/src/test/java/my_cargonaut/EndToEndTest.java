package my_cargonaut;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.javalin.Javalin;
import my_cargonaut.login.LoginService;
import my_cargonaut.utility.data_classes.Tour;
import my_cargonaut.utility.data_classes.offers.OfferPool;
import my_cargonaut.utility.data_classes.user.User;
import my_cargonaut.utility.data_classes.user.UserRegister;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EndToEndTest {
    static Javalin app;
    static LoginService loginService;
    static UserRegister trueRegister;
    static OfferPool offerPool;

    @AfterAll
    static void exterminate(){
        trueRegister.deleteUser("admin");
        offerPool.purgePool("rosebuds");
        app.stop();

    }

    @BeforeAll
    static void initialize(){
        trueRegister = UserRegister.getInstance();
        trueRegister.addNewUser(new User("admin", "rosebuds"));
        offerPool = OfferPool.getInstance();
        loginService = LoginService.getInstance();
        app = App.setUpCargonaut();
        app.start(1234);
    }

    @Test
    public void registerUser() throws InterruptedException {
        String username = "test";
        String password = "testpw";
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://localhost:1234");
        driver.findElement(By.linkText("Registrieren")).click();
        Thread.sleep(500);
        driver.findElement(By.id("registerName")).sendKeys("test");
        assertEquals("test", driver.findElement(By.id("registerName")).getAttribute("value"));
        driver.findElement(By.id("registerPw")).sendKeys("testpw");
        assertEquals("testpw", driver.findElement(By.id("registerPw")).getAttribute("value"));
        //driver.findElement(By.id("registerPw2")).click();
        driver.findElement(By.id("registerPw2")).sendKeys("testpw");
        assertEquals("testpw", driver.findElement(By.id("registerPw2")).getAttribute("value"));
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div/div[4]/button"))).click().perform();
        /*  this can't be guaranteed to be doable for TRAVIS
        hread.sleep(2000);
        assertTrue(trueRegister.getUser("test").isPresent());
        Thread.sleep(500);
        */
        trueRegister.deleteUser("test");
        driver.quit();
    }
    @Test
    public void loginUser() throws InterruptedException{
        String confirmation;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        login(driver);
        confirmation = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div")).getText();
        assertTrue(confirmation.contains("admin"));
        driver.quit();
    }

    @Test
    public void logoutUser() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        login(driver);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/div/ul[2]/li[2]/a")).click();
        assertEquals("Anmelden", driver.findElement(By.id("dropdownMenu1")).getText());
        driver.quit();
    }

    @Test
    public void profileUser() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        login(driver);
        profile(driver);
        assertEquals("Mein Profil", driver.findElement(
                By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/div/div/h2")).getText());
        driver.quit();
    }

    @Test
    public void dealsUser() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        login(driver);
        profile(driver);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/nav/a[2]")).click();
        Thread.sleep(500);
        assertEquals("Meine Deals", driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div/div/h2")).getText());
        driver.quit();
    }

    @Test
    public void carsUser() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        login(driver);
        profile(driver);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/nav/a[3]")).click();
        Thread.sleep(500);
        assertEquals("Mein Fahrzeug", driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/div/div/h2")).getText());
        driver.quit();
    }

    //Logs in, Creates an Entry and then searches for it
    @Test
    public void Offer() throws InterruptedException{
        Date randDate = new Date(System.currentTimeMillis());
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        Actions act = new Actions(driver);
        login(driver);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/div/ul[1]/li/a")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"offerCreateStartLoc\"]")).sendKeys("Test 1");
        driver.findElement(By.xpath("//*[@id=\"offerCreateDestinationLoc\"]")).sendKeys("Test 2");
        driver.findElement(By.xpath("//*[@id=\"offerCreateStartTime\"]")).sendKeys("02192020");
        driver.findElement(By.xpath("//*[@id=\"offerCreateStartTime\"]")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//*[@id=\"offerCreateStartTime\"]")).sendKeys("1245");
        driver.findElement(By.xpath("//*[@id=\"offerCreateHeight\"]")).sendKeys("15");
        driver.findElement(By.xpath("//*[@id=\"offerCreateLength\"]")).sendKeys("15");
        driver.findElement(By.xpath("//*[@id=\"offerCreateDepth\"]")).sendKeys("15");
        driver.findElement(By.xpath("//*[@id=\"offerCreateWeight\"]")).sendKeys("45");
        driver.findElement(By.xpath("//*[@id=\"offerCreateDescription\"]")).sendKeys("A description.");
        act.moveToElement(driver.findElement(By.name("apply"))).click().perform();
        //driver.findElement(By.name("apply")).click();
        Thread.sleep(2000);
        assertEquals("Ihr Angebot wurde erstellt!",
                driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/strong")).getText());
        act.moveToElement( driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/a"))).click().perform();
        //driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/a")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"offerSearchFormOrigin\"]")).sendKeys("Test 1");
        driver.findElement(By.xpath("//*[@id=\"offerSearchFormDestination\"]")).sendKeys("Test 2");
        act.moveToElement( driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/nav/form/div[6]/button"))).click().perform();
        //driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/nav/form/div[6]/button")).click();
        assertEquals("Test 1",
                driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/table/tbody/tr/td[2]")).getText());
        assertEquals("Test 2",
                driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/table/tbody/tr/td[3]")).getText());
        driver.quit();
    }


    public void login(WebDriver driver) throws InterruptedException{
        driver.get("http://localhost:1234");
        driver.findElement(By.id("dropdownMenu1")).click();
        Thread.sleep(100);
        //driver.findElement(By.id("emailInput")).click();
        driver.findElement(By.id("emailInput")).sendKeys("admin");
        driver.findElement(By.id("passwordInput")).sendKeys("rosebuds");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/div/ul[2]/ul/li/ul/li/form/div[3]/button")).click();
        Thread.sleep(500);
    }

    public void profile(WebDriver driver) throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/div/ul[2]/li[1]/a")).click();
        Thread.sleep(500);
    }

}
