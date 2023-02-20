package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3_odev {

    /* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button

    url'ye gidin: https://www.techlistic.com/p/selenium-practice-form.html
     ilk adı doldurun
     soyadını doldur
     cinsiyeti kontrol et
     deneyimi kontrol et
     tarihi doldur
     mesleğinizi seçin -> Otomasyon Test Cihazı
     aracınızı seçin -> Selenium Webdriver
     kıtanızı seçin -> Antarktika
     komutunuzu seçin -> Tarayıcı Komutları
     gönder düğmesine tıklayın
 */
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
        firstname.sendKeys("Hasan");
        WebElement lastname = driver.findElement(By.xpath("//*[@name='lastname']"));
        lastname.sendKeys("SEN");
        driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"exp-3\"]")).click();
    }
}




