package my_cargonaut;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.javalin.Javalin;
import my_cargonaut.login.LoginService;
import my_cargonaut.utility.data_classes.user.User;
import my_cargonaut.utility.data_classes.user.UserRegister;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EndToEndTest {
    static Javalin app;
    static LoginService loginService;
    static UserRegister trueRegister;

    @AfterAll
    static void exterminate(){
        trueRegister.deleteUser("admin");
        app.stop();

    }

    @BeforeAll
    static void initialize(){
        trueRegister = UserRegister.getInstance();
        trueRegister.addNewUser(new User("admin", "rosebuds"));
        loginService = LoginService.getInstance();
        app = App.setUpCargonaut();
        app.start(1234);
    }


    @Test
    public void getToRegisterTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:1234");
        driver.findElement(By.linkText("Registrieren")).click();
        assertEquals("Registrieren", driver.findElement(By.xpath("//h1")).getText(),
                "Did not Find <h1>Registrieren</h1>");
        driver.quit();
    }
    @Test
    public void RegisterUser() throws InterruptedException {
        String username = "test";
        String password = "testpw";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:1234");
        driver.findElement(By.linkText("Registrieren")).click();
        Thread.sleep(100);
        driver.findElement(By.id("registerName")).click();
        driver.findElement(By.id("registerName")).sendKeys(username.toString());
        assertEquals("test", driver.findElement(By.id("registerName")).getAttribute("value"));
        driver.findElement(By.id("registerPw")).click();
        driver.findElement(By.id("registerPw")).sendKeys(password.toString());
        assertEquals("testpw", driver.findElement(By.id("registerPw")).getAttribute("value"));
        driver.findElement(By.id("registerPw2")).click();
        driver.findElement(By.id("registerPw2")).sendKeys(password.toString());
        assertEquals("testpw", driver.findElement(By.id("registerPw2")).getAttribute("value"));
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(100);
        assertTrue(trueRegister.getUser("test").isPresent());
        Thread.sleep(100);
        trueRegister.deleteUser("test");
        driver.quit();
    }

}
