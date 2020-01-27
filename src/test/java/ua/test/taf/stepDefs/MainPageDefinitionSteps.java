package ua.test.taf.stepDefs;

import org.aeonbits.owner.ConfigFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.bs.Ali;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import ua.test.taf.core.config.MainConfig;
import ua.test.taf.pageObject.GooglePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

@Slf4j
public class MainPageDefinitionSteps {

    protected static MainConfig config = ConfigFactory.create(MainConfig.class);

    @Given("User opens Google page")
    public void user_opens_Google_page() {
        open(config.base_url(), GooglePage.class);
    }

    @When("User searches per {string}")
    public void user_searches_per(String string) {
        page(GooglePage.class).searchPer(string);
    }

}
