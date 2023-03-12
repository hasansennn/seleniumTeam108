package EXERCISE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q08 {
    static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void test01(){
        driver.get("https://turkiye.gov.tr");
       driver.findElement(By.xpath("//*[@class='mfp-close']")).click();
        driver.findElement(By.id("homepageHeroBlock")).click();
        WebElement tcKimlikNo=driver.findElement(By.xpath("//input[@name='tridField']"));
        tcKimlikNo.sendKeys("32140312668");
        WebElement sifre= driver.findElement(By.xpath("//input[@name='egpField']"));
        sifre.sendKeys("hasan4451");
      WebElement aramaKutusu= driver.findElement(By.id("searchField"));


      aramaKutusu.sendKeys("Hastane randevu al"+Keys.ENTER);
      driver.findElement(By.xpath("//*[@class='service']")).click();
      driver.findElement(By.xpath("//a[@class='loginLink']")).click();
      driver.findElement(By.xpath("//input[@name='submitButton']")).click();
       // driver.findElement(By.xpath("//*[@class='mfp-close']")).click();

    }



    @After
    public void theardown(){
        driver.close();

    }

}
