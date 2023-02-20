package DAY04_tekrar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class e03_BeforeAfter {

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("setup calisti");
    }


    @After
    public void teardown() {
        driver.close();
        System.out.println("teardown calisti");
    }


    @Test
    public void test01() {
        driver.get("https://www.wisequarter.com");
        driver.close();
    }

    @Test
    public void test02() {
        driver.get("https://www.yotube.com");
        driver.close();

    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass calisti");

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass calisti");
    }
}


