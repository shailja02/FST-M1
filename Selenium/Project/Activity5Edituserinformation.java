package seleniumfstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity5Edituserinformation {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("raj");
        driver.findElement(By.id("personal_optGender_1")).click();

        Select drpCountry = new Select(driver.findElement(By.id("personal_cmbNation")));
        drpCountry.selectByVisibleText("Afghan");
        driver.findElement(By.id("personal_DOB")).click();
        driver.findElement(By.id("btnSave")).click();


    }
}
