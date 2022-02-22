package seleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

public class Grid02 {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.66:4444"),new FirefoxOptions());

        driver.get("https://www.google.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.quit();
    }
}
