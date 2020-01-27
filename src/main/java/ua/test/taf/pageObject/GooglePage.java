package ua.test.taf.pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

import lombok.extern.slf4j.Slf4j;
import ua.test.taf.core.enums.TestCacheKey;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

@Slf4j
public class GooglePage extends AbstractPage {

    //elements
    private SelenideElement searchField = $(By.xpath("//input[@name='q']"));

    public SearchResultPage searchPer(String string) {
        log.info("Set value 'string' to the search field");
        searchField.setValue(string).pressEnter();
        return page(SearchResultPage.class);
    }
}
