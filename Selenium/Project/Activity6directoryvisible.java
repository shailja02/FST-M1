package seleniumfstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Activity6directoryvisible {
   @Test
   public static void main(String[] args)
   {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Boolean Display = driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
        //To print the value
        System.out.println("Element displayed is :" + Display);
        boolean e =driver.findElement(By.id("menu_directory_viewDirectory")).isEnabled();
        if (e) {
            System.out.println("Element is clickable");
        } else {
            System.out.println("Element is not clickable");
        }
        driver.getPageSource().contains("Search Directory");
        System.out.println("search directory is present");



    }
}
