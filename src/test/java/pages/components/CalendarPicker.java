package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarPicker {

    private final SelenideElement yearOfBirthInput = $("[class=react-datepicker__year-select]");
    private final SelenideElement monthOfBirthInput = $("[class=react-datepicker__month-select]");
    private final SelenideElement dayOfBirthInput = $("[class=react-datepicker__month]");

    public CalendarPicker setFullDate(String y, String m, String d) {
        yearOfBirthInput.$(byText(y)).click();
        monthOfBirthInput.$(byText(m)).click();
        dayOfBirthInput.$(byText(d)).click();
        return this;
        }

    }

