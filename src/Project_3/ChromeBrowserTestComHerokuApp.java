package Project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTestComHerokuApp {
    static  String baseUrl="http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        //Launch the chromewebdriver
        WebDriver driver= new ChromeDriver();
        //Open the url
        driver.get(baseUrl);
        //Maximize the browser automatically
        driver.manage().window().maximize();
        // waiting time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title of the page
        System.out.println("Title of the page  : " + driver.getTitle());//driver.getTitle();
        //Print the page source
        System.out.println("The page source : " + driver.getPageSource());
        //Email and password
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("tomsmith");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("i")).click();
        // close the browser
        driver.quit();

    }
}
