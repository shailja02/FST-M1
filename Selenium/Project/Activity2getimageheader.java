package seleniumfstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2getimageheader {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();
        WebElement l = driver.findElement(By.tagName("img"));
        //getAttribute() to get src of image
        System.out.println("Src attribute is: " + l.getAttribute("src"));
        driver.close();
    }
}