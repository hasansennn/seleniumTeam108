package day07_actionsClass_fileTestleri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C09_Waits {
    @Test
    public void test01(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.

      //  4. Remove butonuna basin.
      //  5. “It’s gone!” mesajinin goruntulendigini dogrulayin.

    }

}
