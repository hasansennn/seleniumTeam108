package EXERCISE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class edevletTest {
    WebDriver driver;

    @Before
    public void setUP(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test()
    public void test01(){
       driver.get("https://giris.turkiye.gov.tr/Giris");
       WebElement girisTc= driver.findElement(By.xpath("//input[@name='tridField']"));
       girisTc.sendKeys("32140312668"+Keys.ENTER);
       WebElement edevletSifre= driver.findElement(By.xpath("//input[@name='egpField']"));
       edevletSifre.sendKeys("hasan4451");
       driver.findElement(By.xpath("//input[@name='submitButton']")).click();
       driver.findElement(By.xpath("//a[@class='modal-btn default close']")).click();
       WebElement aramaKutusu= driver.findElement(By.xpath("//input[@id='searchField']"));
       aramaKutusu.sendKeys("Hastane Randevu Al" + Keys.ENTER);
       driver.findElement(By.xpath("//a[text()='Sağlık Bakanlığı/Merkezi Hekim Randevu Sistemi (MHRS)']")).click();
       driver.findElement(By.xpath("//a[@class='ssoLink']")).click();
    }

}
