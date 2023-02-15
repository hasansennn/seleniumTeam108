package day02_webelements_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c08_soru {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



      //  1. Yeni bir class olusturun (TekrarTesti)
      //  2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        driver.get("https://www.youtube.com");
        String expectedBeklenen="youtube";
        String actualDogru= driver.getTitle();

        //  doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        if(actualDogru.equals(expectedBeklenen)){
            System.out.println("youtube title testi PASED");
        }else{
            System.out.println("youtube title testi FAILED" +
                    "\nGerceklesen title : " + actualDogru);
        }

        //   3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        String expectedUrl="youtube";
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Youtube url testi PASSED");
        }else {
            System.out.println("Youtube url testi FAILED" +
                    "\nGerceklesen url : " + actualUrl);
        }


     //   doğru URL'yi yazdırın.
    //    4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
     //   5. Youtube sayfasina geri donun
        driver.navigate().back();
     //   6. Sayfayi yenileyin
        driver.navigate().refresh();
     //   7. Amazon sayfasina donun
        driver.navigate().forward();
     //   8. Sayfayi tamsayfa yapin
     //   9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
     //   Yoksa doğru başlığı(Actual Title) yazdırın.
     //   10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
     //   doğru URL'yi yazdırın
     //   11.Sayfayi kapatin
        driver.quit();

    }
}
