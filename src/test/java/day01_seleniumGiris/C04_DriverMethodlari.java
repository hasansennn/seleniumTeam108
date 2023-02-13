package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wisequarter.com");

        System.out.println(driver.getWindowHandle());
        //CDwindow-6AA4EEC033C77272EC3F606F7279B12E
        //CDwindow-BE9E71B13D872C4968A458A6571DFCA8

        // getWindow Handle selenium tarafindan her driver sayfasi icin uretilen
        // unqiue handle degeri dondurur
        // m

        System.out.println(driver.getPageSource());


        // sayfa kodlari '' 2 hours weekly meeting with t

       // String expectedIcerik=""

        driver.quit();
        // close() ve quit() ikisi de sayfayi kapatmak icin kullanilir
        // close() sadece bir sayfayi kapatirken
        // quit () test ettigimiz butun sayfalari kapatir
    }
}
