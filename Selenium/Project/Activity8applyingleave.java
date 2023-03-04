package seleniumfstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activity8applyingleave {
   @Test
   public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[4]/div/a/img")).click();
       Thread.sleep(2000);
       driver.quit();

    }
}
