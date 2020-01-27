package ua.test.taf.core.driver;

import com.codeborne.selenide.WebDriverProvider;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Browsers.CHROME;

public class GlobalDriverProvider implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        switch (System.getProperty("selenide.browser", "chrome")) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(new ChromeOptions().merge(desiredCapabilities));
            default: throw new IllegalArgumentException("Invalid browser type");
        }
    }
}
