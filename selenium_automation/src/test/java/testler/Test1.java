package testler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Test1 {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokha\\IdeaProjects\\selenium_automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.gittigidiyor.com/uye-girisi");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement mailbox = driver.findElement(By.id("L-UserNameField"));
        mailbox.click();
        mailbox.sendKeys("DenemeSelenium1020@gmail.com");

        WebElement password = driver.findElement(By.id("L-PasswordField"));
        password.click();
        password.sendKeys("Deneme12345");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("gg-login-enter")).click();

        /* Bilgisayar kelimesinin yazılması */

        WebElement searchBox = driver.findElement(By.name("k"));
        searchBox.click();
        searchBox.sendKeys("Bilgisayar");
        driver.findElement(By.cssSelector("button.qjixn8-0.sc-1bydi5r-0.hKfdXF")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /* 2. sayfanın açılması ve bir ürünün detaylı sayfasına gitmek */

        driver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.gittigidiyor.com/bilgisayar-tablet/turbox-atm9918030-i5-3470-4gb-ram-120gb-ssd-ofis-bilgisayari_pdp_676748996");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement price = driver.findElement(By.id("sp-price-discountPrice"));
        String fiyat2 = price.getText();


        driver.get("https://www.gittigidiyor.com/sepetim ");

        

       /* fiyat karşılaştırma */

        WebElement sepetFiyat = driver.findElement(By.className("new-price"));
        String fiyat1 = sepetFiyat.getText();
        if (fiyat2.compareTo(fiyat1) > 0){


           /* Adet yükseltme */

            WebElement adetsayi = driver.findElement(By.id("469489995"));
            adetsayi.click();
            adetsayi.clear();
            adetsayi.sendKeys("2");

        }

         /* sepeti boşaltma */
        driver.findElement(By.className("gg-icon-bin-medium")).click();

    }

}
