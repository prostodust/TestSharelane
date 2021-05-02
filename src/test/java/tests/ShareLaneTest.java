package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {

    //    Authorization on the site
    @Test
    public void authorizationSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys("amit_stuart@020.35.sharelane.com");
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value='Login']")).click();
        driver.quit();
    }

    //    Product search in the catalog
    @Test
    public void productSearchCatalog() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//*[@name='keyword']")).sendKeys("Confucius");
        driver.findElement(By.xpath("//*[@value='Search']")).click();
        driver.quit();
    }

    //    Clicking the "Search" button with an empty search field
    @Test
    public void searchEmptyField() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//*[@value='Search']")).click();
        driver.quit();
    }

    //    Filling in the "ZIP code" field"
    @Test
    public void fillingZIPcodeField() {
        int randomZipCode = (int) (Math.random() * 1000000);
        String ZipCode = Integer.toString(randomZipCode);

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys(ZipCode);
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.quit();
    }

    //    Data entry and registration
    @Test
    public void dataEntryRegistration() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222");
        driver.findElement(By.name("first_name")).sendKeys("Ivan");
        driver.findElement(By.name("last_name")).sendKeys("Petrov");
        driver.findElement(By.name("email")).sendKeys("ivan_petrov@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("12345678");
        driver.findElement(By.name("password2")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }
}
