package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\L e n o v o\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        loginBtn.click();

        WebElement pimMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']")));
        pimMenu.click();

        WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type for hints...']")));
        nameInput.sendKeys("Linda");

        WebElement searchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        searchBtn.click();

        try {
            WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='row']//div[text()='Linda']")));
            if (result.isDisplayed()) {
                System.out.println("✅ Employee 'Linda' found in search results.");
            }
        } catch (Exception e) {
            System.out.println("❌ Employee 'Linda' not found or search failed.");
        }

        driver.quit();
    }
}
