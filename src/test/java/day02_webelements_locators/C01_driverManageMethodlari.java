package day02_webelements_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("Webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        System.out.println("Ilk size :" +driver.manage().window().getSize()); // Ilk size :(1051, 806)
        System.out.println("Ilk position :" +driver.manage().window().getPosition()); // Ilk position :(9, 9)

        // Olculeri ve konumu degistirelim
        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(20,80));
        System.out.println(" size :" +driver.manage().window().getSize());
        System.out.println(" position :" +driver.manage().window().getPosition());


        Thread.sleep(2000);
        driver.close();
    }
}
