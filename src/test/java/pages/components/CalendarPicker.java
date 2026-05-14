package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarPicker {

    private final SelenideElement yearOfBirthInput = $("[class=react-datepicker__year-select]");
    private final SelenideElement monthOfBirthInput = $("[class=react-datepicker__month-select]");
   // private final SelenideElement dayOfBirthInput = $("[class=react-datepicker__month]");
  //  private final SelenideElement dayRightMonth = $(":not[class=react-datepicker__day--outside-month}");

    public CalendarPicker setFullDate(String y, String m, String d) {
        yearOfBirthInput.$(byText(y)).click();
        monthOfBirthInput.$(byText(m)).click();
        $(".react-datepicker__day--0" + d + ":not(.react-datepicker__day--outside-month").click();
        return this;
        }

    }

