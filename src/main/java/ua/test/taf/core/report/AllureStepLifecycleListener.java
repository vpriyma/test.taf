package ua.test.taf.core.report;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.junit.ScreenShooter;
import com.google.common.io.Files;

import org.junit.Rule;

import java.io.File;
import java.io.IOException;

import io.qameta.allure.Attachment;
import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AllureStepLifecycleListener implements StepLifecycleListener {

    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests();

    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] saveScreenshotPNG() throws IOException {
        File screenshot = Screenshots.takeScreenShotAsFile();
        return Files.toByteArray(screenshot);
    }

    @Override
    public void beforeStepStart(StepResult result) {
        log.info(result.getName());
    }

    @Attachment(value = "{description}", type = "text/plain")
    public static String allureText(String data, String description) {
        return data;
    }
}
