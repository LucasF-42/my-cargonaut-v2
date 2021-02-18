package my_cargonaut;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.javalin.Javalin;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EndToEndTest {

    @Test
    public void getToRegisterTest(){
        Javalin app = App.setUpCargonaut();
        app.start(1111);
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://localhost:1111");
        driver.findElement(By.linkText("Registrieren")).click();
        assertEquals("Registrieren", driver.findElement(By.xpath("//h1")).getText(),
                "Did not Find <h1>Registrieren</h1>");
        app.stop();
        driver.quit();
    }
    @Test
    public void RegisterUser(){
        String username = "admin";
        String password = "rosebud";
        Javalin app = App.setUpCargonaut();
        app.start(1111);
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://localhost:1111");
        driver.findElement(By.linkText("Registrieren")).click();
        driver.findElement(By.id("registerName")).click();
        driver.findElement(By.id("registerName")).sendKeys(username.toString());
        assertEquals("admin", driver.findElement(By.id("registerName")).getAttribute("value"));
        driver.findElement(By.id("registerPw")).click();
        driver.findElement(By.id("registerPw")).sendKeys(password.toString());
        assertEquals("rosebud", driver.findElement(By.id("registerPw")).getAttribute("value"));
        driver.findElement(By.id("registerPw2")).click();
        driver.findElement(By.id("registerPw2")).sendKeys(password.toString());
        assertEquals("rosebud", driver.findElement(By.id("registerPw2")).getAttribute("value"));
        driver.findElement(By.linkText("Registrieren"));
        app.stop();
        //driver.quit();
    }

}
