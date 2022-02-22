package seleniumGrid;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid3 {



    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap =new DesiredCapabilities();
        cap.setPlatform(Platform.WINDOWS);
        cap.setBrowserName("chrome");
        cap.setVersion("98.0.4758.102");
        ChromeOptions options=new ChromeOptions();
        options.merge(cap) ;

        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.66:4444"),new ChromeOptions());
        driver.get("https://www.dccomics.com/characters/batman");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.quit();

    }


}
