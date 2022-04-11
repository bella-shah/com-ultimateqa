package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ChromeDriver {public static void main(String[] args) {
    String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
    WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    //launch the url
    driver.get(baseUrl);
    //maximise window
    driver.manage().window().maximize();
    //we give implicit time to driver
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
    //give title
    String title = driver.getTitle();
    System.out.println(title);
    //get current url
    System.out.println("Current URL = " + driver.getCurrentUrl());
    // find the email field element
    WebElement emailField = driver.findElement(By.id("user[email]"));
    emailField.sendKeys("bellashah123@gmail.com");
    //find the password field element
    WebElement passwordField = driver.findElement(By.name("user[password]"));
    passwordField.sendKeys("bella123");
    //close the browser
    driver.close();
}
}

