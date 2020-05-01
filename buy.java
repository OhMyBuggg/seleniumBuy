import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://***");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement b = driver.findElement(By.id("ButtonContainer"));
        b.findElement(By.tagName("button")).click();
        driver.findElement(By.id("ico_cart")).click();

        driver.findElement(By.id("loginAcc")).sendKeys("***email***");
        driver.findElement(By.id("loginPwd")).sendKeys("***password***");
        driver.findElement(By.id("btnLogin")).click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.findElement(By.id("a_cod")).click();

        driver.findElement(By.xpath("//input[@value='P']")).click();
        driver.findElement(By.name("ReceiverName")).sendKeys("***name***");
        driver.findElement(By.name("ReceiverMobile")).sendKeys("***phonenumber***");
        Select op =  new Select(driver.findElement(By.id("ReceiverAddrCity")));
        op.selectByVisibleText("***city***");
        Select op2 =  new Select(driver.findElement(By.id("ReceiverAddrRegion")));
        op2.selectByVisibleText("***region***");

        driver.findElement(By.name("ReceiverAddr")).sendKeys("***address***");
    }
}