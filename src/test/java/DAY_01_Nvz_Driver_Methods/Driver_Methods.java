package DAY_01_Nvz_Driver_Methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver_Methods {

    WebDriver driver;


    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // driver.findElement(By)

    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
       // Thread.sleep(2000);
        System.out.println(driver.getWindowHandle());
        driver.navigate().refresh();
        System.out.println(driver.getWindowHandle());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.facebook.com");
        System.out.println(driver.getWindowHandles());


    }

    @After
    public void teardown(){

    }
}
