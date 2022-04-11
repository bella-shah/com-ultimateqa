package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FireFoxDriver {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver", "Drivers/firefoxgeckodriver.exe");
        WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
        //launch the url
        driver.get(baseUrl);
        // maximise windaw
        driver.manage().window().maximize();
        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        // get the title
        String title = driver.getTitle();
        System.out.println(title);
        //get the current url
        System.out.println("Current URL = " + driver.getCurrentUrl());
        //find the email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("bellashah123@gmail.com");
        //find the password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("bella123");
        //close the browser
        driver.close();
    }
}

