package seleniumfstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7addingqualifications {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        driver.findElement(By.linkText("Qualifications")).click();
        driver.findElement(By.id("addWorkExperience")).click();
        driver.findElement(By.id("experience_employer")).sendKeys("IBM");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("system engineer");
        driver.findElement(By.id("btnWorkExpSave")).click();
        driver.close();
    }
}
