package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru2 {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.hepsiburada.com");
    WebElement aramaKutusu= driver.findElement(By.xpath("//*[@id=\"SearchBoxOld_89b8da2f-a29f-406d-1044-67ba0548afc6\"]/div/div/div[1]/div[2]/input"));
    driver.quit();



    }
}
