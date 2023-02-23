package day08_ecplivtilyWait_cookies_webTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ExplicitlyWait {
   @Test
    public void test01(){

       WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();

       //amazon anasayfa gidin

       // arama kutusu clickable oluncaya kadar bekleyin


       // Nutella icin arama yapin
   }
}
