package ua.test.taf.stepDefs;

import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SearchResultDefinitionSteps {

    @Then("User checks that title contains {string} word")
    public void user_checks_that_title_contains_word(String string) {
        assertThat(title()).contains(string);
    }

}
