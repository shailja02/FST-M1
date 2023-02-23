package seleniumfstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4addnewemployee {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.linkText("Employee List")).click();
        driver.findElement(By.name("btnAdd")).click();

        driver.findElement(By.id("firstName")).sendKeys("shreyal");
        driver.findElement(By.id("lastName")).sendKeys("sanghvi");
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("shreyal");
        driver.close();
    }
}
