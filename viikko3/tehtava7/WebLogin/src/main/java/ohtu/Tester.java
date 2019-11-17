package ohtu;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:4567");
        
        sleep(2);
        
//      Logging in with correct username and password
//        WebElement element = driver.findElement(By.linkText("login"));
//        element.click();
//
//        sleep(2);

//        element = driver.findElement(By.name("username"));
//        element.sendKeys("pekka");
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("akkep");
//        element = driver.findElement(By.name("login"));
//
//        sleep(2);
//        element.submit();

//      Logging in with correct username and wrong password
//        WebElement element = driver.findElement(By.linkText("login"));
//        element.click();
//
//        sleep(2);
//        
//        element = driver.findElement(By.name("username"));
//        element.sendKeys("pekka");
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("wrong");
//        element = driver.findElement(By.name("login"));
//        
//        sleep(2);
//        element.submit();

//      Creating a new user
//        WebElement element = driver.findElement(By.linkText("register new user"));
//        element.click();
//        
//        sleep(2);
//        
//        Random rand = new Random();
//        element = driver.findElement(By.name("username"));
//        element.sendKeys("testi" + rand.nextInt(10000));
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("passw0rd");
//        element = driver.findElement(By.name("passwordConfirmation"));
//        element.sendKeys("passw0rd");
//        element = driver.findElement(By.name("signup"));
//        
//        sleep(2);
//        element.submit();
        
//      Creating a new user and logging out
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();
        
        sleep(2);
        
        Random rand = new Random();
        element = driver.findElement(By.name("username"));
        element.sendKeys("testi" + rand.nextInt(10000));
        element = driver.findElement(By.name("password"));
        element.sendKeys("passw0rd");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("passw0rd");
        element = driver.findElement(By.name("signup"));
        
        sleep(2);
        element.submit();

        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        
        sleep(2);
        
        element = driver.findElement(By.linkText("logout"));
        element.click();
        
        sleep(3);
        
        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
