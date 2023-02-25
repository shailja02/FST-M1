package seleniumfstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Activity1_title {
    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println(title);
        if (title.matches("OrangeHRM")) {
            driver.close();
        }











    }

}
