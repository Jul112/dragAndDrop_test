package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class dragAndDropTest {

    @Test
    void drag_and_drop_Test() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#content").shouldHave(text("Drag and Drop"));

        $("#column-b").click();
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        String pngTestDrop = screenshot("scrTestDrop");




    }

}
