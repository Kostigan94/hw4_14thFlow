package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Drag {
    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
    }

    @Test
    void shouldDragAndDrop() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-b").dragAndDrop($("#column-a"));
        //$(".HeaderMenu").$(byText("Compare plans")).click();
        //$(".h2-mktg").shouldHave(text("Choose the plan that’s right for you."));
    }

}