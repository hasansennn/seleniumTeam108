package EXERCISE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01 {

    /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */

    public static void main(String[] args) {

        // 1 - Set Path
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver");
        // Bu satirda sisteme driver'imizi tanitiyoruz. Driver'imizin yolunu gosteriyoruz

        // 2 -  Create chrome driver
        WebDriver driver=new ChromeDriver();

        // 3 -  Maximize the window
        driver.manage().window().maximize();

        // 4 -  Open google home page https://www.google.com/.
        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com"); Ayni islemi yapar bagimli senaryolarda navigate kullaniliriz
        // Get methodu daha hizli calisir


        // 5 -  On the same class, Navigate to amazon home page https://www.amazon.com/
      //  driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com");

        // 6 -  Navigate back to google
        driver.navigate().back();

        // 7 - Navigate forward to amazon
        driver.navigate().forward();

        // 8 - Refresh the page
        driver.navigate().refresh();

        // 9 -  Close/Quit the browser
        driver.quit();

        // 10 - And last step : print "All Ok" on console
        System.out.println("All Ok" );









    }
}
