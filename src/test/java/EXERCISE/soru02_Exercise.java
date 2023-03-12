package EXERCISE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru02_Exercise {

    //Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //  a. Verilen web sayfasına gidin.
    //       https://the-internet.herokuapp.com/checkboxes
    //  b. Checkbox1 ve checkbox2 elementlerini locate edin.
    //  c. Checkbox1 seçili değilse onay kutusunu tıklayın
    //  d. Checkbox2 seçili değilse onay kutusunu tıklayın

    WebDriver driver;

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @After
    public void teardawn() {
        //   driver.close();

    }

    @Test
    public void Test01() {
        //  Verilen web sayfasına gidin.
        driver.get(" https://the-internet.herokuapp.com/checkboxes");
        // b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement cbox1 = driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
        WebElement cbox2 = driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));

        // c. Checkbox1 seçili değilse onay kutusunu tıklayın
        if (!cbox1.isSelected()) {
            cbox1.click();
        }
        //  d. Checkbox2 seçili değilse onay kutusunu tıklayın
        if (!cbox2.isSelected()) {
            cbox2.click();
        }
        // // e. checkbox1 ve checkbox2'nin secili oldugunu test edin
        Assert.assertTrue(cbox1.isSelected());
        Assert.assertTrue(cbox2.isSelected());
    }
}







