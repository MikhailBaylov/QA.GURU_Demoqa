package pages.components;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultTableChecker {

    private final SelenideElement titleOutput = $("[class=modal-content]");
    private final SelenideElement fieldsOutput = $("[class=table-responsive]");

    public ResultTableChecker checkTitleOutput(String value) {
        titleOutput.shouldHave(text(value));
        return this;
    }

    public ResultTableChecker checkFieldsOutput(String key, String value) {
        fieldsOutput.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }
}
