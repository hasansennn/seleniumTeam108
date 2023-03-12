package EXERCISE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.trendyol.com/ sayfasina gidelim
        driver.get("https://www.trendyol.com/");

        //2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='sfx-discovery-search-suggestions']/div/div/input"));

        //3- “Akıllı Saat” ile arama yapalim
        aramaKutusu.sendKeys("Akıllı Saat" + Keys.ENTER);
        //4- Bulunan sonuc sayisini yazdiralim
        System.out.println(driver.
                findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[1]/div[1]/div"))
                .getText());
        //5- Ilk urunu tiklayalim
        driver.
                findElement(By.xpath("//*[@id=\"search-app\"]/div/div[1]/div[2]/div[3]/div[1]/div/div[2]/div[1]/a/div[1]/div[2]/div[2]"))
                .click();

        Thread.sleep(3000);
        driver.quit();
    }
}






