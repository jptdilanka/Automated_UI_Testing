package seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday1 {
    public static void main(String[] args) {
        // Set path to chromedriver.exe (update path as needed)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\L e n o v o\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Maximize browser window
        driver.manage().window().maximize();
    }
}
