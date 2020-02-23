import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class categoryTest {

    @Test
    public void categoryNormal() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();

        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("60");
        browser.findElement(By.name("ht")).sendKeys("165");
        browser.findElement(By.name("cc")).click();

        String category = browser.findElement(By.name("desc")).getAttribute("value");

        assertEquals(category, "Your category is Normal", "Категория неверная");
        browser.quit();
    }

    @Test
    public void categoryOverweight() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("80");
        browser.findElement(By.name("ht")).sendKeys("175");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Overweight", "Категория неверная");
        browser.quit();
    }

    @Test
    public void categoryStarvation() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("40");
        browser.findElement(By.name("ht")).sendKeys("165");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        assertEquals(category, "Your category is Starvation", "Категория неверная");
        browser.quit();
    }
}
