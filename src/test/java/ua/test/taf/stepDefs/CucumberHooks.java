package ua.test.taf.stepDefs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.logevents.SelenideLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.extern.slf4j.Slf4j;
import ua.test.taf.core.driver.GlobalDriverProvider;

import static ua.test.taf.Constants.TimeOuts.DEFAULT_TIMEOUT;
import static ua.test.taf.core.cache.TestCache.initializeTestCache;

@Slf4j
public class CucumberHooks {

    @Before(order = 1)
    public void preSetUp() {
        initializeTestCache();
//        setDefaultSecureHttpClient();
    }

    @Before(order = 2)
    public void setUp(Scenario scenario) {
        setUpSelenideForRun();
    }

//    @AfterStep
//    public void takeScreenshotOnFail(Scenario scenario) {
//        if (scenario.isFailed()) {
//            try {
//                File screenshot = Screenshots.takeScreenShotAsFile();
//                InputStream targetStream = new FileInputStream(screenshot);
//                Allure.addAttachment("Screenshot on fail", "image/png", targetStream, "png");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    private void setUpSelenideForRun() {
        Configuration.browser = GlobalDriverProvider.class.getName();
        Configuration.timeout = DEFAULT_TIMEOUT;
        Configuration.startMaximized = true;
        Configuration.screenshots = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}
