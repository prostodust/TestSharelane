package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {

    @Test
    public void fillZipcodeFildTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("222222");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.quit();
    }

    @Test
    public void fillSighUpFildTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222");
        driver.findElement(By.name("first_name")).sendKeys("Ol");
        driver.findElement(By.name("last_name")).sendKeys("Kuz");
        driver.findElement(By.name("email")).sendKeys("kom@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("12345678");
        driver.findElement(By.name("password2")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }
}
