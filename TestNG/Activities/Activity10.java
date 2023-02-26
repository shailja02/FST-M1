package FST_TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.Reporter;
import org.openqa.selenium.interactions.actions;


public class Activity10 {
    WebDriver driver;
    Actions builder;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        builder = new Actions(driver);

        //Open browser
        driver.get("https://www.training-support.net/selenium/sliders");
    }

    @Test
    public void sliderToMiddleTest() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Clicking on the slider element moves it to the middle
        slider.click();

        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Mid value: " + volumeLevel);

        Assert.assertEquals(volumeLevel, "50");
    }

    @Test
    public void sliderToMaxTest() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();

        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Max value: " + volumeLevel);

        Assert.assertEquals(volumeLevel, "100");
    }

    @Test
    public void sliderToMinTest() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(-75, 0).release().build().perform();

        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);

        Assert.assertEquals(volumeLevel, "0");
    }

    @Test
    public void sliderTo30Test() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();

        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);

        Assert.assertEquals(volumeLevel, "30");
    }

    @Test
    public void sliderTo80Test() {
        //Find slider
        WebElement slider = driver.findElement(By.id("slider"));
        //Drag the slider
        builder.clickAndHold(slider).moveByOffset(45, 0).release().build().perform();

        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Min value: " + volumeLevel);

        Assert.assertEquals(volumeLevel, "80");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
}
